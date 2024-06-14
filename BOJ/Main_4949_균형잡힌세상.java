package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main_4949_균형잡힌세상 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {

            Stack<String> stack = new Stack<>();
            String sentence = br.readLine();
            String[] strArr = sentence.split("");

            if (sentence.equals(".")) return;

            boolean check = true;

            for (int i = 0; i < strArr.length; i++) {
                String str = strArr[i];

                if (str.equals("(") || str.equals("[")) {
                    stack.add(str);

                } else if (str.equals(")")) {

                    if (!stack.isEmpty() && stack.peek().equals("(")) {
                        stack.pop();
                    } else {
                        System.out.println("no");
                        check = false;
                        break;
                    }

                } else if (str.equals("]")) {
                    if (!stack.isEmpty() && stack.peek().equals("[")) {
                        stack.pop();
                    } else {
                        System.out.println("no");
                        check = false;
                        break;
                    }
                }
            }
            //check == true 이고 stack size 가 0 이면 yes
            if (check) {
                if (stack.size() == 0) {
                    System.out.println("yes");
                } else {
                    System.out.println("no");
                }
            }
        }
    }
}
