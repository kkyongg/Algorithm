package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//너의 평점은
public class Baekjoon_25206 {
    public static void main(String[] args) throws IOException {
        //전공평점은 전공과목별 (학점 × 과목평점)의 합을 학점의 총합으로 나눈 값
        //학점은 1.0,2.0,3.0,4.0중 하나
        //등급은 A+,A0,B+,B0,C+,C0,D+,D0,F,P중 하나
        //ObjectOrientedProgramming1 3.0 A+
        //소수점 여섯째자리까지 출력

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        double[] creditArr = new double[20]; //학점
        double[] scoreArr = new double[20]; //평점

        for (int i = 0; i < 20; i++) {
            String score = bufferedReader.readLine();
            String[] arr = score.split(" ");
            creditArr[i] = Double.parseDouble(arr[1]);

            switch (arr[2]) {
                case "A+":
                    scoreArr[i] = 4.5;
                    break;
                case "A0":
                    scoreArr[i] = 4.0;
                    break;
                case "B+":
                    scoreArr[i] = 3.5;
                    break;
                case "B0":
                    scoreArr[i] = 3.0;
                    break;
                case "C+":
                    scoreArr[i] = 2.5;
                    break;
                case "C0":
                    scoreArr[i] = 2.0;
                    break;
                case "D+":
                    scoreArr[i] = 1.5;
                    break;
                case "D0":
                    scoreArr[i] = 1.0;
                    break;
                case "P":
                    creditArr[i] = 10.0;
                    scoreArr[i] = 10.0;
                    break;
                case "F":
                    scoreArr[i] = 0.0;
                    break;
            }
        }

        double mul; //학점 x 평점
        double sum = 0; //학점 x 평점의 총 합(모든 과목)
        double result = 0; //(학점 × 과목평점)의 합을 학점의 총합으로 나눈 값

        for (int i = 0; i < 20; i++) {
            if (creditArr[i] != 10.0 && scoreArr[i] != 10.0) {
                mul = creditArr[i] * scoreArr[i];
                sum += mul;
            }
            if (creditArr[i] != 10.0) {
                result += creditArr[i];
            }
        }

        System.out.printf("%.6f", sum / result); //소수점 여섯째자리까지 출력

    }
}

