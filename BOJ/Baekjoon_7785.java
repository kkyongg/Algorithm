package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Baekjoon_7785 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int recordCase = Integer.parseInt(bufferedReader.readLine());

        StringTokenizer stringTokenizer;
        Map<String, String> map = new HashMap<>();
        for (int i = 0; i < recordCase; i++) {
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());

            String name = stringTokenizer.nextToken();
            String situation = stringTokenizer.nextToken();
            map.put(name, situation);

            if (map.containsKey(name) && situation.equals("leave")) {
                map.remove(name);
            }
        }

        //key 정렬
        List<String> keyList = new ArrayList<>(map.keySet());
        Collections.sort(keyList);

        //key 역순으로 출력
        for (int i = keyList.size() - 1; i > -1; i--) {
            System.out.println(keyList.get(i));
        }
    }
}
