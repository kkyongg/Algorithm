package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_5582_공통부분문자열 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String strA = br.readLine();
        String strB = br.readLine();
        int[][] dp = new int[strA.length() + 1][strB.length() + 1];

        int answer = 0;

        for (int i = 1; i <= strA.length(); i++) {
            char A = strA.charAt(i - 1); // 문자열은 0부터 시작이라 i-1

            for (int j = 1; j <= strB.length(); j++) {
                char B = strB.charAt(j - 1); // 문자열은 0부터 시작이라 j-1

                if (A == B) {
                    dp[i][j] = dp[i - 1][j - 1] + 1; // dp[i-1][j-1]에 저장된 값에 +1
                    answer = Math.max(answer, dp[i][j]);
                }
            }
        }

        System.out.println(answer);

    }
}
