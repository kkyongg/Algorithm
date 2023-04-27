package baekjoon;

import java.util.Scanner;

public class Baekjoon_10953 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCase = scanner.nextInt();
        int n1 = 0, n2 = 0;

        for (int i = 0; i < testCase; i++) {

            String[] arr = scanner.next().split(",");
            n1 = Integer.parseInt(arr[0]);
            n2 = Integer.parseInt(arr[1]);
            System.out.println(n1 + n2);
        }

    }
}
