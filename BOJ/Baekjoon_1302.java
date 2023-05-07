package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Baekjoon_1302 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int inputCase = Integer.parseInt(bufferedReader.readLine());

        Map<String, Integer> map = new HashMap<>();
        int max = 0;
        for (int i = 0; i < inputCase; i++) {
            String title = bufferedReader.readLine();
            if (map.containsKey(title)) {
                map.put(title, map.get(title) + 1);
            } else {
                map.put(title, 1);
            }
            max = Math.max(max, map.get(title));
        }

        List<String> list = new ArrayList<>();

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() == max) list.add(entry.getKey());
        }

        Collections.sort(list);
        System.out.println(list.get(0));
    }

}
