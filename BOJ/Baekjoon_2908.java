package BOJ;

import java.util.Scanner;

public class Baekjoon_2908 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] compareNum = new int[2];
        for (int i = 0; i < 2; i++) {
            int n = scanner.nextInt();

            int num1 = n % 10; //1의 자리
            int num10 = n % 100 / 10; //10의 자리
            int num100 = n % 1000 / 100; //100의 자리

            int result = (num1 * 100) + (num10 * 10) + (num100);
            compareNum[i] = result;

        }

        //두 수 중에 큰 수 출력
        System.out.println(Math.max(compareNum[0], compareNum[1]));

    }
}
