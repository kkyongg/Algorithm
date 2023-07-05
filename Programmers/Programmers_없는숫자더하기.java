package Programmers;

import java.util.ArrayList;
import java.util.List;

public class Programmers_없는숫자더하기 {
    public static void main(String[] args) {

        int[] numbers = {0, 1, 2, 3, 4, 6, 7, 8};
        System.out.println(solution(numbers));

    }

    public static int solution(int[] numbers) {
        int answer = 0;

        List<Integer> compare = new ArrayList<>();
        for (int input = 0; input < 10; input++) {
            compare.add(input);
        }

        for (int i = 0; i < numbers.length; i++) {
            compare.set(numbers[i], 0);
        }

        for (int j = 0; j < compare.size(); j++) {
            answer += compare.get(j);
        }

        return answer;
    }
}