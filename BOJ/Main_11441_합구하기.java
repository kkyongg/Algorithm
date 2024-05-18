package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_11441_합구하기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //수의 개수 n
        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] arr = new int[n + 1];
        int[] sum = new int[n + 1]; //누적 합

        for (int i = 1; i <= n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 1; i <= n; i++) {
            sum[i] = arr[i] + sum[i - 1];

        }

        //합 구하기
        int m = Integer.parseInt(br.readLine());
        for (int i = 0; i < m; i++) {
            int result = 0;

            st = new StringTokenizer(br.readLine());

            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());

            result = sum[end] - sum[start - 1];
            System.out.println(result);
        }
    }
}
