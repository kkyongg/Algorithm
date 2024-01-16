package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_2810_컵홀더 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int seats = Integer.parseInt(br.readLine()); //좌석 수
        String info = br.readLine(); //좌석 정보

        StringBuilder sb = new StringBuilder(); //컵홀더가 추가된 좌석정보 저장
        for (int i = 0; i < seats; i++) {
            if (info.charAt(i) == 'S') { //일반좌석일 때
                sb.append("*S");
            } else { //커플석일 때
                sb.append("*LL");
                i++;
            }
        }
        sb.append("*"); //마지막 좌석에 컵홀더 추가

        int result = 0;
        for (int i = 0; i < sb.length(); i++) {
            if (sb.charAt(i) == '*') {
                result++;
            }
        }

        //컵홀더가 좌석 수보다 많다면 좌석 수 출력
        if (result > seats) {
            System.out.println(seats);
        } else {
            System.out.println(result);
        }
    }
}

