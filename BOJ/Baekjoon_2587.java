package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Baekjoon_2587 {
    public static void main(String[] args) throws IOException {
        //다섯개의 수
        //평균, 중앙값
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int[] numArr = new int[5];
        for (int i = 0; i < 5; i++) {
            String num = bufferedReader.readLine();
            numArr[i] = Integer.parseInt(num);
        }

        int sum = 0;

        for (int j = 0; j < 5; j++) {
            sum += numArr[j];
        }
        int average = sum / 5;
        //int[] 내림차순 정렬
        Arrays.sort(numArr);

        System.out.println(average);
        System.out.println(numArr[2]);

        bufferedReader.close();
    }
}
