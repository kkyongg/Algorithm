package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Baekjoon_1764 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        int[] arr = new int[2];

        for (int i = 0; i < 2; i++) {
            int n = Integer.parseInt(stringTokenizer.nextToken());
            arr[i] = n;
        }

        HashSet<String> set = new HashSet<>();

        for (int i = 0; i < arr[0]; i++) {
            String name = bufferedReader.readLine();
            set.add(name);
        }

        ArrayList<String> arrayList = new ArrayList<>();
        for (int j = 0; j < arr[1]; j++) {
            String name1 = bufferedReader.readLine();

            if (set.contains(name1)) {
                arrayList.add(name1);
            }
        }
        System.out.println(arrayList.size());

        Collections.sort(arrayList);

        Iterator<String> iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next()); // arrayList 요소를 하나씩 출력
        }
    }
}
