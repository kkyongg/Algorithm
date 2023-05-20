package SWEA;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_2001_파리퇴치 {
    public static int[][] square;
    public static int max, length, find;


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int testCase = Integer.parseInt(br.readLine());

        StringTokenizer st;

        for (int i = 0; i < testCase; i++) {
            st = new StringTokenizer(br.readLine());
            length = Integer.parseInt(st.nextToken());
            find = Integer.parseInt(st.nextToken());

            square = new int[length][length];

            for (int j = 0; j < length; j++) {
                st = new StringTokenizer(br.readLine());
                for (int k = 0; k < length; k++) {
                    int num = Integer.parseInt(st.nextToken());
                    square[j][k] = num;
                }
            }
            getNumbers();
            System.out.println("#" + (i + 1) + " " + max);
        }
    }

    public static void getNumbers() {
        max = 0;
        int sum;

        //탐색횟수
        int search = length - find + 1;

        for (int i = 0; i < search; i++) {
            for (int j = 0; j < search; j++) {

                sum = 0;
                for (int k = 0; k < find; k++) {
                    for (int l = 0; l < find; l++) {
                        sum += square[i + k][j + l];
                    }
                }
                if (max < sum) {
                    max = sum;
                }
            }
        }
    }
}
