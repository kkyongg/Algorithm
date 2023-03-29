package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon_10988 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String str = bufferedReader.readLine();

        boolean result = true;
        for (int i = 0; i < str.length(); i++) {

            int start = str.charAt(i);
            int end = str.charAt(str.length() - 1 - i);

            if (start != end) {
                result = false;
                break;
            }
        }

        if (result) {
            System.out.println(1);

        } else {
            System.out.println(0);
        }
    }
}
