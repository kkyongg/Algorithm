package BOJ;

import java.util.Scanner;

public class Baekjoon_8393 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int sum = 0;
        for (int i = 1; i < num + 1; i++) {
            sum = sum + i;
        }
        System.out.println(sum);
    }
}
