package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Baekjoon_10816 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int putNumbers = Integer.parseInt(bufferedReader.readLine());

        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        int[] putNum = new int[putNumbers];
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < putNumbers; i++) {
            putNum[i] = Integer.parseInt(stringTokenizer.nextToken());

            if (i > 0 && map.containsKey(putNum[i])) { //만약 이미 그 수가 있다면 value 값을 구해 +1을 해줌
                map.put(putNum[i], map.get(putNum[i]) + 1);
            } else {
                map.put(putNum[i], 1);
            }
        }

        int checkNumbers = Integer.parseInt(bufferedReader.readLine());
        stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        int[] resultNum = new int[putNumbers];
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < checkNumbers; i++) {
            resultNum[i] = Integer.parseInt(stringTokenizer.nextToken()); //찾으려는 수

            if (map.containsKey(resultNum[i])) { //찾는 수가 map 에 있다면 value 값을 append
                stringBuilder.append(map.get(resultNum[i])).append(" ");
            } else { //없다면 0을 append
                stringBuilder.append(0 + " ");
            }
        }

        System.out.println(stringBuilder);

    }
}
