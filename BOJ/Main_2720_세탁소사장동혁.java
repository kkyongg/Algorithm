package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_2720_세탁소사장동혁 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(br.readLine());
        int[] changes = new int[testCase];

        for (int i = 0; i < testCase; i++) {
            changes[i] = Integer.parseInt(br.readLine());
        }

        //쿼터 0.25, 다임 0.1, 니켈 0.05, 페니 0.01
        //ex) 124 = 1.24 = 쿼터 4개, 다임 2개, 페니 4개
        int[] coins = new int[]{25, 10, 5, 1};
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < changes.length; i++) {
            int count;
            for (int j = 0; j < coins.length; j++) {
                count = changes[i] / coins[j];
                sb.append(count+" ");
                changes[i] %= coins[j];
            }
            sb.append("\n");
        }

        System.out.println(sb);


    }
}

