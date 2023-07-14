package SWEA;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_2072_홀수만더하기 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(br.readLine());

        StringTokenizer st;

        for (int i = 0; i < testCase; i++) {

            int count = 0;
            int[] numArr = new int[10];
            st = new StringTokenizer(br.readLine());

            for (int j = 0; j < 10; j++) {
                numArr[j] = Integer.parseInt(st.nextToken());

                if (numArr[j] % 2 != 0) {
                    count += numArr[j];
                }
            }

            System.out.println("#" + (i + 1) + " " + count);

        }
    }
}
