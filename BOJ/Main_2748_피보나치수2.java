package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_2748_피보나치수2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());

        long zero = 0; //전 전 항
        long first = 1; //전 항
        //num이 1일때 반복문 실행 x. so sum은 1로 초기화
        long sum = 1;

        for (int i = 1; i < num; i++) {
            sum = zero + first;

            zero = first;
            first = sum;
        }

        System.out.println(sum);
    }
}