package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon_11050 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        int n = Integer.parseInt(stringTokenizer.nextToken());
        int k = Integer.parseInt(stringTokenizer.nextToken());

        int n1 = factorial(n); //n!
        int n2 = factorial(k); //k!
        int n3 = factorial(n - k); //(n-k)!

        int result = n1 / (n2 * n3);
        System.out.println(result);

    }

    public static int factorial(int n) {
        int num = 1;
        if (n == 1) {
            return 1;
        }
        while (n > 1) {
            num *= n;
            n--;
        }
        return num;

    }
}