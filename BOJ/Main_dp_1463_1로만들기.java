package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_dp_1463_1로만들기 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());

        int[] dp = new int[num + 1];
        dp[1] = 0; //초기값 설정

        for (int i = 2; i <= num; i++) {
            dp[i] = dp[i - 1] + 1;
            if (i % 3 == 0) {
                dp[i] = Math.min(dp[i / 3] + 1, dp[i]);
            }

            if (i % 2 == 0) {
                dp[i] = Math.min(dp[i / 2] + 1, dp[i]);
            }

        }
        System.out.println(dp[num]);

    }
}