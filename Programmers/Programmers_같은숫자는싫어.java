package Programmers;

import java.util.Arrays;
import java.util.Stack;

public class Programmers_같은숫자는싫어 {
    public static void main(String[] args) {

        int[] arr1 = {1, 1, 3, 3, 0, 1, 1};
        int[] answer = solution(arr1);
        System.out.println(Arrays.toString(answer));

        int[] arr2 = {4, 4, 4, 3, 3};
        int[] answer2 = solution(arr2);
        System.out.println(Arrays.toString(answer2));

    }

    public static int[] solution(int[] arr) {
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < arr.length; i++) {
            if (i > 0) {
                if (arr[i] == arr[i - 1]) {
                } else {
                    stack.push(arr[i]);
                }
            } else {
                stack.push(arr[i]);
            }
        }

        int[] answer = new int[stack.size()];

        for (int j = stack.size() - 1; j >= 0; j--) {
            //stack : LIFO, 배열 맨 뒤부터 차례대로
            answer[j] = stack.peek();
            stack.pop();
        }

        return answer;
    }
}
