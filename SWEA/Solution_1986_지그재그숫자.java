package SWEA;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution_1986_지그재그숫자 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(br.readLine());

        for (int i = 0; i < testCase; i++) {
            int result = 0;
            int num = Integer.parseInt(br.readLine());

            for (int j = 1; j <= num; j++) {
                if (j % 2 == 0) {
                    result = result - j;
                } else {
                    result = result + j;
                }
            }

            System.out.println("#" + (i + 1) + " " + result);
        }
    }
}