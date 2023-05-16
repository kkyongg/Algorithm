package SWEA;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_1869_백만장자프로젝트 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int inputCase = Integer.parseInt(br.readLine());

        StringTokenizer st;
        for (int i = 0; i < inputCase; i++) {
            int days = Integer.parseInt(br.readLine());
            int[] dayArr = new int[days];
            st = new StringTokenizer(br.readLine());

            for (int j = 0; j < days; j++) {
                int price = Integer.parseInt(st.nextToken());
                dayArr[j] = price;
            }
            long result = calculate(dayArr);
            System.out.println("#" + (i + 1) + " " + result);
        }
    }

    public static long calculate(int[] arr) {

        //뒤에서부터 풀기 ㄷ ㄷ ㄷ ㄷ ㄷ
        long sum = 0;
        int max = 0;
        for (int i = arr.length - 1; i >= 0; i--) {

            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < max) { //max 보다 작으면 sum 에 더하기
                sum += max - arr[i];
            }

        }

        return sum;
    }
}
