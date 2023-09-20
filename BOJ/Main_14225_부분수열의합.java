package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main_14225_부분수열의합 {
    public static int n;
    public static int[] arr;
    public static Set<Integer> set = new HashSet<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine()); //수열 크기

        StringTokenizer st = new StringTokenizer(br.readLine());
        arr = new int[n];
        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(st.nextToken());
            arr[i] = num;
        }

        permutation(0, 0);

        //set -> list 변환 후 오름차순
        List<Integer> list = new ArrayList<>(set);
        Collections.sort(list);
        int count = 1;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) != count) {
                System.out.println(count);
                return;
            }
            count++;
        }
        System.out.println(count);
    }

    public static void permutation(int start, int sum) {
        if (n == start) {
            return;
        }

        for (int i = start; i < n; i++) {
            sum += arr[i];
            set.add(sum);
            permutation(i + 1, sum);
            sum -= arr[i];

        }
    }
}