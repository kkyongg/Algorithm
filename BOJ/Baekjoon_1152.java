package BOJ;

import java.util.Scanner;
import java.util.StringTokenizer;

//단어의 개수
public class Baekjoon_1152 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str = scanner.nextLine();
        StringTokenizer stringTokenizer = new StringTokenizer(str," ");

        System.out.println(stringTokenizer.countTokens());

    }
}
