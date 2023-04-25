package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon_1978 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int inputCase = Integer.parseInt(bufferedReader.readLine());

        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        int result = 0; //소수인 수의 개수

        for (int i = 0; i < inputCase; i++) {
            int count = 0;
            int num = Integer.parseInt(stringTokenizer.nextToken());
            for (int j = 1; j <= num; j++) {
                if (num % j == 0) {
                    count++;
                }
            }
            if (count == 2) { //1과 자기 자신과 나누어 떨어지면 소수기 때문에
                result++;
            }
        }
        System.out.println(result);
    }
}
