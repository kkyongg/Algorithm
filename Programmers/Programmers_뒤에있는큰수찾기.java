package Programmers;

import java.util.Arrays;
import java.util.Stack;

public class Programmers_뒤에있는큰수찾기 {
    public static void main(String[] args) {

        System.out.println(Arrays.toString(solution(new int[]{2, 3, 3, 5})));
        System.out.println(Arrays.toString(solution(new int[]{9, 1, 5, 3, 6, 2})));

    }

    public static int[] solution(int[] numbers) {

        int[] answer = new int[numbers.length];
        Stack<Integer> stack = new Stack<>();

        stack.push(0);

        for (int i = 1; i < numbers.length; i++) {
            while (!stack.isEmpty() && numbers[stack.peek()] < numbers[i]) {
                answer[stack.pop()] = numbers[i];
            }
            stack.push(i);

        }
        //모두 탐색 후 뒤에 있는 큰 수가 없는 경우
        while (!stack.isEmpty()) {
            answer[stack.pop()] = -1;
        }

        return answer;
    }
}