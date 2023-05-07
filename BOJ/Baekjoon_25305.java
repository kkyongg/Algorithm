package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class Baekjoon_25305 {
    public static void main(String[] args) throws IOException {
        //5 2(응시자 수 상 받는 사람 수)
        //100 76 85 93 98 (각 학생의 점수)
        //커트라인 출력하기 : 상을 받는 사람들 중 점수가 가장 가장 낮은 사람의 점수

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        int[] studentArr = new int[2];
        for (int i = 0; i < 2; i++) {
            studentArr[i] = Integer.parseInt(stringTokenizer.nextToken());
        }

        int[] scoreArr = new int[studentArr[0]];
        stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        for (int j = 0; j < studentArr[0]; j++) {
            scoreArr[j] = Integer.parseInt(stringTokenizer.nextToken());
        }

        //내림차순
        Integer[] scoreArr2 = Arrays.stream(scoreArr).boxed().toArray(Integer[]::new);
        Arrays.sort(scoreArr2, Collections.reverseOrder());
        System.out.println(scoreArr2[studentArr[1] - 1]);

    }
}
