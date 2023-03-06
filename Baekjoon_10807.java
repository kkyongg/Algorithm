package baekjoon;

import java.util.Scanner;

public class Baekjoon_10807 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCase = scanner.nextInt(); //정수의 개수
        int[] numArr = new int[testCase];

        for (int i = 0; i < testCase; i++) {
            numArr[i] = scanner.nextInt(); //정수가 공백으로 구분
        }

        int findNum = scanner.nextInt(); //찾으려고 하는 정수

        int cnt = 0;
        for (int j = 0; j < numArr.length; j++) {
            if (numArr[j] == findNum) {
                cnt++;
            }
        }
        System.out.println(cnt); //첫째 줄에 입력으로 주어진 N개의 정수 중에 v가 몇 개인지 출력

    }
}
