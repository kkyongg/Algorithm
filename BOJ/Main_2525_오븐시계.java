package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_2525_오븐시계 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int hour = Integer.parseInt(st.nextToken());
        int minute = Integer.parseInt(st.nextToken());
        int needTime = Integer.parseInt(br.readLine());

        minute = minute + needTime;
        //60분 이상이면 hour에 +1시간 해야함
        if (minute >= 60) {
            while (minute >= 60) {
                minute = minute - 60;
                hour += 1;
            }
        }
        //0시 0분 ~ 23시 59분이라서 hour이 24 이상이면 hour - 24해야함
        if (hour > 23) {
            hour -= 24;
        }

        System.out.println(hour + " " + minute);
    }
}
