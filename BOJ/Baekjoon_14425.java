package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Baekjoon_14425 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        int case1 = Integer.parseInt(stringTokenizer.nextToken());
        int case2 = Integer.parseInt(stringTokenizer.nextToken());

        Map<String, Integer> map = new HashMap();
        int count = 0;

        for (int i = 0; i < case1; i++) {
            map.put(bufferedReader.readLine(), 1);
        }
        for (int j = 0; j < case2; j++) {
            String str = bufferedReader.readLine();
            if (map.get(str) != null) {
                count++;
            }
        }
        System.out.println(count);

        bufferedReader.close();

        /*
        List<String> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();


        for (int i = 0; i < case1; i++) {
            list1.add(bufferedReader.readLine());
        }

        for (int i = 0; i < case2; i++) {
            list2.add(bufferedReader.readLine());
        }

        int count = 0;
        for (int i = 0; i < list1.size(); i++) {
            for (int j = 0; j < list2.size(); j++) {
                if (list1.get(i).equals(list2.get(j))) {
                    count++;
                }
            }
        }
        System.out.println(count);
        bufferedReader.close();

         */
    }

}
