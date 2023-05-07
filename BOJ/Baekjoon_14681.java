package BOJ;

import java.util.Scanner;

public class Baekjoon_14681 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt(); //x
        int b = scanner.nextInt(); //y

        if (a > 0) {
            if (b > 0) {//1사분면
                System.out.println(1);
            } else { //4사분면
                System.out.println(4);
            }
        }
        if (a < 0) {
            if (b > 0) { //2사분면
                System.out.println(2);
            } else { //3사분면
                System.out.println(3);
            }
        }
    }
}
