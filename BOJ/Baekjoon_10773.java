package BOJ;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class Baekjoon_10773 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCase = scanner.nextInt();

        Stack<Integer> stack = new Stack<>();
        int sum = 0;

        for (int i = 0; i < testCase; i++) {
            int num = scanner.nextInt();

            if (num == 0) {
                stack.pop();
            } else {
                stack.push(num);
            }

        }

        for (int j = 0; j < stack.size(); j++) {
            sum += stack.get(j);
        }
        System.out.println(sum);
        
        /*
        ArrayList<Integer> arrList = new ArrayList<>();
        int sum = 0;

        for (int i = 0; i < testCase; i++) {
            int num = scanner.nextInt();

            //입력 숫자가 0이면 list 의 마지막 값 삭제
            if (num == 0) {
                arrList.remove(arrList.size() - 1);
            } else {
                arrList.add(num);
            }

        }
        //list 모든 값 더하기
        for (int j = 0; j < arrList.size(); j++) {
            sum += arrList.get(j);
        }
        System.out.println(sum);
        */
    }


}

