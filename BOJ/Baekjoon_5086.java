package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon_5086 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer stringTokenizer;
        for (int i = 0; i < 1000; i++) {
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());

            int first = Integer.parseInt(stringTokenizer.nextToken());
            int last = Integer.parseInt(stringTokenizer.nextToken());

            if (first == 0 && last == 0) {
                break;
            } else if (last % first == 0) {
                System.out.println("factor");
            } else if (first % last == 0) {
                System.out.println("multiple");
            } else {
                System.out.println("neither");
            }

        }

    }
}
