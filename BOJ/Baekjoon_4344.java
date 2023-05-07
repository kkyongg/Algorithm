package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//평균은 넘겠지
public class Baekjoon_4344 {
    public static void main(String[] args) throws IOException {
        //첫째 줄에는 테스트 케이스의 개수 C
        //둘째 줄부터 학생의 수 N, 이어서 N명의 점수
        //각 케이스마다 한 줄씩 평균을 넘는 학생들의 비율을 반올림하여 소수점 셋째 자리까지 출력

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(bufferedReader.readLine());

        StringTokenizer stringTokenizer;

        int sum;
        double average;
        double count;

        for (int i = 0; i < testCase; i++) { //테스트 케이스만큼 반복

            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            int studentNum = Integer.parseInt(stringTokenizer.nextToken()); //학생 수
            double[] scoreArr = new double[studentNum]; //점수를 넣기 위해 학생 수만큼의 배열 생성

            //각 테스트 케이스마다 초기화 시켜줘야함
            sum = 0;
            average = 0;
            count = 0;

            for (int j = 0; j < studentNum; j++) {
                scoreArr[j] = Integer.parseInt(stringTokenizer.nextToken()); //학생 수만큼 점수 입력
                sum += scoreArr[j]; //각 점수의 합
            }

            average = (double) sum / studentNum; //평균 구하기

            for (int k = 0; k < studentNum; k++) {
                if (scoreArr[k] > average) { //평균점수 넘는 학생 카운트
                    count++;
                }
            }
            System.out.printf("%.3f%s", (count / studentNum) * 100, "%"); //평균 넘는 학생 비율을 퍼센트로 출력
            System.out.println();
        }
        bufferedReader.close();
    }
}
