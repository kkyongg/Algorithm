package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon_11659 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        int n = Integer.parseInt(stringTokenizer.nextToken()); //수의 개수
        int m = Integer.parseInt(stringTokenizer.nextToken()); //합을 구해야 하는 횟수

        int[] numArr = new int[n + 1];
        numArr[0] = 0;

        stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        for (int i = 1; i < n + 1; i++) {
            int num = Integer.parseInt(stringTokenizer.nextToken());
            numArr[i] = numArr[i - 1] + num; //누적 합 계산
        }

        for (int i = 0; i < m; i++) {
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            int start = Integer.parseInt(stringTokenizer.nextToken());
            int end = Integer.parseInt(stringTokenizer.nextToken());

            System.out.println(numArr[end] - numArr[start - 1]);

        }
    }
}
