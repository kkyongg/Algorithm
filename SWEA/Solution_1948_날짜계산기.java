package SWEA;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_1948_날짜계산기 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(br.readLine());
        int[] month = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        StringTokenizer st;
        for (int i = 0; i < testCase; i++) {
            st = new StringTokenizer(br.readLine());

            int sm = Integer.parseInt(st.nextToken());
            int sd = Integer.parseInt(st.nextToken());
            int em = Integer.parseInt(st.nextToken());
            int ed = Integer.parseInt(st.nextToken());

            int days;
            if (sm == em) { //같은 달이면
                days = ed - sd + 1;
            } else {
                days = (month[sm] - sd + 1) + ed; //시작한 달 날짜 + 마지막 달 날짜만 계산
                for (int j = sm + 1; j < em; j++) { //시작한 달의 다음 달부터 마지막 달의 전 달까지 계산
                    days += month[j];
                }
            }

            System.out.println("#" + (i + 1) + " " + days);
        }
    }
}
