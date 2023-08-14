package Programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Programmers_모의고사 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{1, 2, 3, 4, 5})));
        System.out.println(Arrays.toString(solution(new int[]{1, 3, 2, 4, 2})));
    }

    public static int[] solution(int[] answers) {

        int[] firstStudent = new int[]{1, 2, 3, 4, 5};
        int[] secondStudent = new int[]{2, 1, 2, 3, 2, 4, 2, 5};
        int[] thirdStudent = new int[]{3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        int[] score = new int[3]; //수포자마다 맞은 개수

        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == firstStudent[i % 5]) score[0]++;
            if (answers[i] == secondStudent[i % 8]) score[1]++;
            if (answers[i] == thirdStudent[i % 10]) score[2]++;
        }

        //가장 높은 점수
        int max = Math.max(score[0], Math.max(score[1], score[2]));

        List<Integer> studentList = new ArrayList<>();
        for (int i = 0; i < score.length; i++) {
            //가장 높은 점수 받은 수포자
            if (max == score[i]) {
                studentList.add(i + 1);
            }
        }

        int[] answer = new int[studentList.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = studentList.get(i);
        }

        return answer;
    }
}
