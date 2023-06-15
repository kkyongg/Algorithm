package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main_17413_단어뒤집기2 {
    public static String str;
    public static StringBuilder sb;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        str = br.readLine();
        boolean flag = false; //<> 체크

        if (str.contains("<")) { //<> 있을 때

            sb = new StringBuilder();
            Stack<Character> stack = new Stack<>(); //LIFO

            for (int i = 0; i < str.length(); i++) {
                //<일 때 그 앞에 있던 원소들 다 pop
                if (str.charAt(i) == '<') {
                    while (!stack.isEmpty()) {
                        sb.append(stack.pop());
                    }
                    flag = true;
                } else if (str.charAt(i) == '>') {
                    flag = false;
                    sb.append(str.charAt(i));
                    continue;
                }
                //flag == true 면, 괄호 안이니까 그대로 출력해야함
                if (flag) {
                    sb.append(str.charAt(i));
                } else { //flag == false 면, stack 에 넣어야함, 거꾸로 출력해야함
                    if (str.charAt(i) == ' ') {
                        while (!stack.isEmpty()) {
                            sb.append(stack.pop());
                        }
                        sb.append(' ');
                        continue;
                    } else {
                        stack.add(str.charAt(i));
                    }
                }

                if (i == str.length() - 1) { //반복문 마지막일 때 스택 비어있지 않다면 pop
                    while (!stack.isEmpty()) {
                        sb.append(stack.pop());
                    }
                }
            }
            System.out.println(sb);

        } else { //<> 없을 때
            reverse();
        }
    }

    public static void reverse() {
        sb = new StringBuilder();

        Stack<Character> stack = new Stack<>(); //LIFO
        String split = str.replace(" ", ",");
        String[] words = split.split(",");

        for (int i = 0; i < words.length; i++) {

            for (int j = 0; j < words[i].length(); j++) { //한단어씩
                char eachOfWord = words[i].charAt(j); //한글자씩
                stack.add(eachOfWord);
            }

            if (i > 0) { //첫번째 이후부터 각각 단어 사이에 공백 넣어줘야함
                stack.add(' ');
            }

            int size = stack.size(); //한 단어가 들어있음
            for (int k = 0; k < size; k++) {
                sb.append(stack.pop()); //한 글자씩 pop
            }

        }
        System.out.println(sb);
    }
}