package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon_2869 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        int[] arr = new int[3];
        for (int i = 0; i < 3; i++) {

            arr[i] = Integer.parseInt(stringTokenizer.nextToken());
        }

        //arr[0] = 낮에 올라감(+)
        //arr[1] = 밤에 미끄러짐(-) (정상에 올라가면 미끄러지지 않음)
        //arr[0] = 목표 미터

        int result = (arr[2] - arr[1]) / (arr[0] - arr[1]);
        if ((arr[2] - arr[1]) % (arr[0] - arr[1]) != 0)

            result++;

        System.out.println(result);
    }
}
