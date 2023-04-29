package baekjoon.BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Baekjoon_20291 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int input = Integer.parseInt(bufferedReader.readLine());

        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < input; i++) {
            String fileName = bufferedReader.readLine();
            for (int j = 0; j < fileName.length(); j++) {
                String file = String.valueOf(fileName.charAt(j));
                if (file.equals(".")) {
                    String result = fileName.substring(j + 1, fileName.length());

                    if (map.containsKey(result)) {
                        map.put(result, map.get(result) + 1);
                    } else {
                        map.put(result, 1);
                    }
                    break;
                }
            }
        }
        Object[] mapkey = map.keySet().toArray();
        Arrays.sort(mapkey);

        for (int i = 0; i < mapkey.length; i++) {
            System.out.println(mapkey[i] + " " + map.get(mapkey[i]));
        }
    }
}
