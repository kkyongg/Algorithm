package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_1929_소수구하기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int m = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());

        boolean[] isPrime = new boolean[n + 1]; //기본값 false

        //소수가 아닌 값은 true 로
        isPrime[0] = isPrime[1] = true;

        //에라토스테네스의 체
        for (int i = 2; i < isPrime.length; i++) {
            for (int j = 2; i * j < isPrime.length; j++) {
                if (!isPrime[i * j]) isPrime[i * j] = true;
            }
        }

        for (int i = m; i <= n; i++) {
            if (!isPrime[i]) System.out.println(i);
        }
    }
}
