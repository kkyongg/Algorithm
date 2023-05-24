package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_13458_시험감독 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine()); //시험장 수

        int[] testRoom = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            testRoom[i] = Integer.parseInt(st.nextToken()); //시험장마다의 사람 수
        }

        st = new StringTokenizer(br.readLine());
        int topDirector = Integer.parseInt(st.nextToken()); // 총감독관 감시 가능 인원
        int secondDirector = Integer.parseInt(st.nextToken()); //부감독관 감시 가능 인원

        //while문 시간초과
        //출력값이 최대일 때 int 범위 넘기 때문에 long 으로 선언 *************
        long answer = 0;
        int studentNum = 0;
        for (int i = 0; i < testRoom.length; i++) {
            long count = 0;

            if (testRoom[i] <= topDirector) {
                answer += 1;
                continue;
            } else {
                count++;
                studentNum = testRoom[i] - topDirector; //총 인원 - 총감독관 감시 가능 인원 => 부감독관이 감시해야 할 인원
            }

            count += studentNum / secondDirector; // (총 인원 / 부감독관 감시 가능 인원) 의 몫 => 필요한 부감독관의 수

            int remainder = studentNum % secondDirector; // (총 인원 / 부감독관 감시 가능 인원) 의 나머지
            if (remainder > 0 && remainder < secondDirector) { //나머지가 0이면 부감독관 필요 x, 남은 인원이 secondDirector 보다 작으면 부감독관 +1 해야함
                count++;
            }
            answer += count;
        }

        System.out.println(answer);
    }
}