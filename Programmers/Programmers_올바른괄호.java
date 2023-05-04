package baekjoon.Programmers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Programmers_올바른괄호 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String s = bufferedReader.readLine();
        boolean answer = true;

        // 스택 사용
        // (()())((()))
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char first = s.charAt(i);

            if (s.charAt(0) == ')') {
                answer = false;
                break;
            }

            if (first == '(') {
                stack.push(first);
            } else {
                if (stack.isEmpty()) {
                    answer = false;
                } else {
                    stack.pop();
                }
            }
        }

        if (!stack.isEmpty()) {
            answer = false;
        }
        System.out.println(answer);

        /*
        // 스택 사용 x - 프로그래머스 효율성 시간초과 ;;
        // (()())((()))
        int length = s.length(); //length = 12
        for (int i = 0; i < length; i++) { //i < s.length() 로 하면 x, s가 ()일때 이미 i < 2 라서 for문 나감
            s = s.replace("()", "");
            if (s.length() == 0) {
                break;
            }
        }

        if (s.length() != 0) { //length != 0 하면 x, length가 12라서
            answer = false;
        }

        System.out.println(answer);

         */

    }
}
