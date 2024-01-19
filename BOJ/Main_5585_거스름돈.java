package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_5585_거스름돈 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //잔돈
        int[] coins = new int[]{500, 100, 50, 10, 5, 1};
        //1000엔 냈을 때 거스름돈
        int change = 1000 - Integer.parseInt(br.readLine());

        int count = 0;
        for (int i = 0; i < coins.length; i++) {
            count += change / coins[i];
            change %= coins[i];
        }

        System.out.println(count);
    }
}

