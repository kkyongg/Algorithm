package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Baekjoon_10818 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.parseInt(bufferedReader.readLine());

        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        int num;
        int[] numArr = new int[input];
        for (int i = 0; i < input; i++) {
            num = Integer.parseInt(stringTokenizer.nextToken());
            numArr[i] = num;
        }

        Arrays.sort(numArr);

        System.out.println(numArr[0] + " " + numArr[numArr.length - 1]);
    }
}
