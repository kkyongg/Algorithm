package baekjoon;

import java.util.Scanner;

public class Baekjoon_27866 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        String [] strArr = str.split("");
        int num = scanner.nextInt();

        System.out.println(strArr[num-1]);

    }
}
