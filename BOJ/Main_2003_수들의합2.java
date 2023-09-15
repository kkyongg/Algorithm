package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_2003_수들의합2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken()); //n개로 된 수열
        int m = Integer.parseInt(st.nextToken()); //구하려는 합
        int[] arr = new int[n];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int count = 0, end = 0, intervalSum = 0;
        for (int start = 0; start < n; start++) {
            while (intervalSum < m && end < n) {
                intervalSum += arr[end];
                end++;
            }
            if (intervalSum == m) {
                count++;
            }
            intervalSum -= arr[start];
        }
        System.out.println(count);
    }
}

