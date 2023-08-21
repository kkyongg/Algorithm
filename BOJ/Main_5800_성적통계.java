package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main_5800_성적통계 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int k = Integer.parseInt(br.readLine()); //class 수

        StringTokenizer st;
        for (int i = 0; i < k; i++) {
            st = new StringTokenizer(br.readLine());

            //학생 수, 학생 수대로 점수 나열
            int student = Integer.parseInt(st.nextToken());
            Integer[] score = new Integer[student]; //내림차순 하려면 Integer 타입으로 배열로 선언해야함

            for (int j = 0; j < student; j++) {
                score[j] = Integer.parseInt(st.nextToken());
            }

            Arrays.sort(score, Collections.reverseOrder());

            int min = score[score.length - 1];
            int max = score[0];
            int gap = 0;

            //인접한 점수간의 차이 중 가장 큰 차이
            for (int j = 0; j < score.length - 1; j++) {
                gap = Math.max(score[j] - score[j + 1], gap);
            }

            System.out.println("Class " + (i + 1));
            System.out.println("Max " + max + ", " + "Min " + min + ", " + "Largest gap " + gap);

        }
    }
}
