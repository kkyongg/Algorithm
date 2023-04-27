package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Baekjoon_1920 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int inputNum = Integer.parseInt(bufferedReader.readLine());

        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        int[] numArr = new int[inputNum];
        for (int i = 0; i < inputNum; i++) {
            numArr[i] = Integer.parseInt(stringTokenizer.nextToken());
        }
        Arrays.sort(numArr);

        int checkNum = Integer.parseInt(bufferedReader.readLine());
        stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        for (int i = 0; i < checkNum; i++) {
            int check = Integer.parseInt(stringTokenizer.nextToken());
            if (Arrays.binarySearch(numArr, check) < 0) {
                System.out.println(0);
            } else {
                System.out.println(1);
            }
        }
    }
}
        /*

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int inputNum = Integer.parseInt(bufferedReader.readLine());

        Map<Integer, Integer> inputMap = new HashMap<>(inputNum);
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        for (int i = 0; i < inputNum; i++) {
            inputMap.put(Integer.valueOf(stringTokenizer.nextToken()), 0);
        }

        int checkNum = Integer.parseInt(bufferedReader.readLine());
        stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        for (int i = 0; i < checkNum; i++) {
            if (inputMap.containsKey(Integer.parseInt(stringTokenizer.nextToken()))) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }
        }

         */

