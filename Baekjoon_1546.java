package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Baekjoon_1546 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(bufferedReader.readLine()); //과목 수

        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        List<Integer> scoreList = new ArrayList<>(); //점수
        for (int i = 0; i < num; i++) {
            scoreList.add(Integer.parseInt(stringTokenizer.nextToken()));
        }

        //내림차순으로 정렬해서 최댓값 저장하기
        scoreList.sort(Collections.reverseOrder());
        double max = scoreList.get(0);

        double[] resultArr = new double[scoreList.size()]; //새로운 점수를 배열에 저장
        for (int i = 0; i < scoreList.size(); i++) {

            double result = scoreList.get(i) / max * 100; //세준이 계산법
            resultArr[i] = result;
        }

        double sum = 0;
        for (int i = 0; i < scoreList.size(); i++) {
            sum += resultArr[i];
        }
        double average = sum / scoreList.size();

        System.out.println(average);
    }
}
