package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon_2563 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int input = Integer.parseInt(bufferedReader.readLine());
        StringTokenizer stringTokenizer;

        int[][] arr = new int[100][100];

        int count = 0;
        for (int i = 0; i < input; i++) {
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            int x = Integer.parseInt(stringTokenizer.nextToken());
            int y = Integer.parseInt(stringTokenizer.nextToken());

            for (int j = x; j < x + 10; j++) {
                for (int k = y; k < y + 10; k++) {

                    if (arr[j][k] == 0) {
                        arr[j][k] = 1;
                        count++;
                    }
                }
            }
        }

        System.out.println(count);
    }
}

