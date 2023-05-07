package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon_10872 {
    public static void main(String[] args) throws IOException {
        
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine());
/*
        if (n == 0) {
            System.out.println(1);
        } else {
            int sum = 1;
            int repeat = n;
            for (int i = 0; i < repeat; i++) {
                sum = sum * n;
                n--;
            }
            System.out.println(sum);
        }
*/        
        //재귀함수 사용해서 코드 짜보기
        int sum = factorial(n);
        System.out.println(sum);
        
    }
    public static int factorial(int n) {
        if (n == 1)
            return 1;
        return n * factorial(n - 1);
    }
}
