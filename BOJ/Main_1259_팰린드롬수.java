package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_1259_팰린드롬수 {
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        boolean answer;
        while (true) {
            answer = true;
            int input = Integer.parseInt(bufferedReader.readLine());
            if (input == 0) break;

            String temp = String.valueOf(input);
            int[] arr = new int[temp.length()];

            for (int i = 0; i < temp.length(); i++) {
                arr[i] = temp.charAt(i) - '0';
            }

            for (int i = 0; i < temp.length() / 2; i++) {
                if (arr[i] != arr[arr.length - 1 - i]) {
                    answer = false;
                    break;
                }
            }
            if (answer) System.out.println("yes");
            else System.out.println("no");
        }
    }
}

