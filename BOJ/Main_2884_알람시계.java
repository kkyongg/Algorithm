package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_2884_알람시계 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int hour = Integer.parseInt(st.nextToken());
        int minute = Integer.parseInt(st.nextToken());

        if (minute >= 45) { //45분보다 크면 분 만 빼주기
            sb.append(hour).append(" ").append(minute - 45);
        } else {
            if (hour == 0) {
                hour = 23;
            }
            hour = hour - 1;
            minute = 45 - minute;
            sb.append(hour).append(" ").append(60 - minute);
        }
        System.out.println(sb);
    }
}

