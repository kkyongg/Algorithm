package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_1476_날짜계산 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int e = Integer.parseInt(st.nextToken());
        int s = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int earth = 0, sun = 0, moon = 0, year = 0;

        while (true) {
            earth++;
            sun++;
            moon++;
            year++;

            if (earth == 16) earth = 1;
            if (sun == 29) sun = 1;
            if (moon == 20) moon = 1;

            if (earth == e && sun == s && moon == m) {
                break;
            }
        }
        System.out.println(year);
    }
}
