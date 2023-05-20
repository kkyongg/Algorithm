package SWEA;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_1961_숫자배열회전 {
    public static int[][] nArr;
    public static int n;
    public static int testCase;
    public static String[] arr90;
    public static String[] arr180;
    public static String[] arr270;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        testCase = Integer.parseInt(br.readLine());

        StringTokenizer st;

        for (int t = 0; t < testCase; t++) {
            n = Integer.parseInt(br.readLine());
            nArr = new int[n][n];
            for (int i = 0; i < n; i++) {
                st = new StringTokenizer(br.readLine());

                for (int j = 0; j < n; j++) {
                    nArr[i][j] = Integer.parseInt(st.nextToken());
                }
            }
            rotationArr();
            System.out.println("#" + (t + 1));
            for (int i = 0; i < n; i++) {
                System.out.println(arr90[i] + " " + arr180[i] + " " + arr270[i]);
            }
        }
    }

    public static void rotationArr() {

        StringBuilder sb;
        arr90 = new String[n];
        arr180 = new String[n];
        arr270 = new String[n];

        //90도
        for (int i = 0; i < n; i++) {
            sb = new StringBuilder();
            for (int j = n - 1; j >= 0; j--) {
                sb.append(nArr[j][i]);
            }
            arr90[i] = String.valueOf(sb);
        }

        //180도
        for (int i = n - 1; i >= 0; i--) {
            sb = new StringBuilder();
            for (int j = n - 1; j >= 0; j--) {
                sb.append(nArr[i][j]);
            }
            arr180[n - 1 - i] = String.valueOf(sb);
        }

        //270도
        for (int i = n - 1; i >= 0; i--) {
            sb = new StringBuilder();
            for (int j = 0; j < n; j++) {
                sb.append(nArr[j][i]);
            }
            arr270[n - 1 - i] = String.valueOf(sb);
        }
    }
}
