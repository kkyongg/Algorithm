package Programmers;

import java.util.*;

public class Programmers_택배상자 {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{4, 3, 1, 2, 5})); //2
        System.out.println(solution(new int[]{5, 4, 3, 2, 1})); //5
    }

    public static int solution(int[] order) {
        Stack<Integer> subContainer = new Stack<>();

        int answer = 0;
        int index = 0;

        for (int i = 1; i <= order.length; i++) {

            if (order[index] != i) {
                subContainer.push(i);
            } else {
                index++;
                answer++;
            }

            while (!subContainer.isEmpty() && subContainer.peek() == order[index]) {
                subContainer.pop();
                index++;
                answer++;
            }
        }

        return answer;
    }
}


