package SWEA;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution_2805_농작물수확하기 {
    public static int[][] arr;
    public static int result, length;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int testCase = Integer.parseInt(br.readLine());

        for (int t = 0; t < testCase; t++) {
            length = Integer.parseInt(br.readLine());
            arr = new int[length][length];

            for (int i = 0; i < length; i++) {
                String num = br.readLine();
                for (int j = 0; j < length; j++) {
                    arr[i][j] = num.charAt(j) - '0';
                }
            }
            getValue();
            System.out.println("#" + (t + 1) + " " + result);
        }
    }

    public static void getValue() {
        //result 에 총 수확 결과
        int start = length / 2;
        int end = length / 2;
        result = 0;

        for (int i = 0; i < length; i++) {
            for (int j = start; j < end + 1; j++) {
                result += arr[i][j];
            }
            if (i < length / 2) {
                start -= 1;
                end += 1;
            } else {
                start += 1;
                end -= 1;
            }
        }
    }
}
