package Programmers;

import java.util.Arrays;
import java.util.Comparator;

public class Programmers_정렬_가장큰수 {
    public static void main(String[] args) {
        int[] strings1 = new int[]{6, 10, 2};
        int[] strings2 = new int[]{3, 30, 34, 5, 9};

        System.out.println(solution(strings1));
        System.out.println(solution(strings2));
    }

    public static String solution(int[] numbers) {
        String answer = "";

        //사전순 정렬

        String[] strings = new String[numbers.length];
        for (int i = 0; i < strings.length; i++) {
            strings[i] = String.valueOf(numbers[i]);
        }

        Arrays.sort(strings, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return (o2 + o1).compareTo(o1 + o2);
            }
        });

        //모든 수가 0일때
        if (strings[0].equals("0")) return "0";

        for (int i = 0; i < strings.length; i++) {
            answer += strings[i];
        }

        return answer;
    }
}