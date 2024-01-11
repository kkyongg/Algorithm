package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_11047_동전0 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int[] coins = new int[n];
        for (int i = 0; i < n; i++) {
            coins[i] = Integer.parseInt(br.readLine());
        }

        //coins = 1,5,10,50,100,500,1000,5000,10000,50000
        int count = 0;
        for (int i = n - 1; i >= 0; i--) {
            if (k >= coins[i]) {
                count += k / coins[i];
                k -= (k / coins[i]) * coins[i]; //k = k % coins[i];
            }
        }

        System.out.println(count);
    }
}

