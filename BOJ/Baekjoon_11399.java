package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon_11399 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int inputCase = Integer.parseInt(bufferedReader.readLine());
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        int[] arr = new int[inputCase];
        for (int i = 0; i < inputCase; i++) {
            int time = Integer.parseInt(stringTokenizer.nextToken());
            arr[i] = time;
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        int result = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i > 0) {
                arr[i] += arr[i - 1];
                result += arr[i];
            }
        }

        System.out.println(arr[0] + result);
    }
}
