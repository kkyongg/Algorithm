package baekjoon.Programmers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Programmers_문자열내p와y의개수 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String s = bufferedReader.readLine().toLowerCase();

        int p_count = 0;
        int y_count = 0;
        for (int i = 0; i < s.length(); i++) {
            char check = s.charAt(i);
            String result = Character.toString(check);
            if (result.equals("p")) {
                p_count++;
            } else if (result.equals("y")) {
                y_count++;

            }
        }
        if (p_count == y_count) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}
