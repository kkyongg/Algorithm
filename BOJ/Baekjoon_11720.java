package BOJ;

import java.util.Scanner;

//정수를 문자열로 입력받기

public class Baekjoon_11720 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int testCase = scanner.nextInt();
        String result = String.valueOf(scanner.next());

        if (result.length() == testCase) {

            int sum = 0;
            for (int i = 0; i < result.length(); i++) {
                char num = result.charAt(i);
                sum = sum + (num-'0'); //char to int : 아스키코드 사용
            }
            System.out.println(sum);

        }
    }
}
