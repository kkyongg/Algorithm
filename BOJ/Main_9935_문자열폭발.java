package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main_9935_문자열폭발 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine(); //문자열
        String bomb = br.readLine(); //폭발 문자열

        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            int count = 0;
            stack.push(str.charAt(i));

            if (stack.size() >= bomb.length()) { //스택 사이즈가 폭발 문자열 길이와 같거나 크면 비교
                for (int j = 0; j < bomb.length(); j++) {
                    if (stack.get(stack.size() - bomb.length() + j) == bomb.charAt(j)) {
                        count++;
                    }
                    if (count == bomb.length()) {
                        for (int k = 0; k < bomb.length(); k++) { //폭발 문자열 제거
                            stack.pop();
                        }
                    }
                }
            }
        }

        if (stack.isEmpty()) {
            System.out.println("FRULA");
        } else {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < stack.size(); i++) {
                sb.append(stack.get(i));
            }
            System.out.println(sb);
        }
    }
}


