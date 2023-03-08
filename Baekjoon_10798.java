package baekjoon;

import java.util.Scanner;

//세로읽기
public class Baekjoon_10798 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        char[][] charArr = new char[5][15]; //총 5개의 문자와 최대 15길이를 가진 문자

        for (int i = 0; i < 5; i++) {
            String str = scanner.next(); //5개를 입력 받아서

            for (int j = 0; j < str.length(); j++) {
                charArr[i][j] = str.charAt(j); //글자 수를 배열에 넣음
            }
        }

        for (int m = 0; m < 15; m++) {

            for (int n = 0; n < 5; n++) {
                if(charArr[n][m] ==0) continue; //값이 없어도 continue

                System.out.print(charArr[n][m]); //세로로 읽기
            }
        }

    }
}
