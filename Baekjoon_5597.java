package baekjoon;

import java.util.Scanner;

public class Baekjoon_5597 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        boolean[] allStudent = new boolean[31];
        for (int i = 0; i < 28; i++) {
            int student = scanner.nextInt(); //과제 제출 학생
            allStudent[student] = true;
        }

        for (int i = 1; i < 31; i++) { //1번부터 30번까지
            if (!allStudent[i])  //false 인 경우 내지 않은 학생
                System.out.println(i);

        }
    }
}
