package baekjoon;

import java.util.Scanner;

public class Baekjoon_9086 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //테스트 케이스 개수
        int testCase = sc.nextInt();
        String[] strArr = new String[testCase];

        //테스트 케이스만큼 반복해서 입력받음
        for (int i = 0; i < testCase; i++) {
            strArr[i] = sc.next();
        }

        String str;
        for (int j = 0; j < testCase; j++) {
            str = strArr[j];

            //문자열의 첫번째 글자와 마지막 글자
            System.out.println(str.charAt(0) + "" + str.charAt(str.length() - 1));

        }
    }
}
