package Programmers;

import java.util.Arrays;
import java.util.Collections;

public class Programmers_정수내림차순으로배치하기 {
    public static void main(String[] args) {

        System.out.println(solution(118372));

    }

    public static long solution(long n) {
        StringBuilder sb = new StringBuilder();

        String[] numbers = String.valueOf(n).split("");
        Arrays.sort(numbers, Collections.reverseOrder());

        for (int i = 0; i < numbers.length; i++) {
            sb.append(numbers[i]);
        }

        long answer = Long.parseLong(sb.toString());

        return answer;
    }

}
