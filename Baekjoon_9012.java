package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon_9012 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(bufferedReader.readLine());

        for (int i = 0; i < testCase; i++) {
            String str = bufferedReader.readLine();
            for (int j = 0; j < 50; j++) {
                if (str.length() != 0) {
                    str = str.replace("()", "");
                } else {
                    break;
                }
            }
            if (str.length() > 0) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
            }
        }
    }
}
