package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_10162_전자레인지 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int sec = Integer.parseInt(br.readLine());

        int[] buttonTime = new int[]{300, 60, 10}; //A:5분(300초), B:1분(60초), C:10초
        int[] result = new int[3];

        if (sec % 10 == 0) {
            for (int i = 0; i < 3; i++) {
                result[i] = sec / buttonTime[i];
                sec = sec - (result[i] * buttonTime[i]);
                System.out.print(result[i] + " ");
            }
        } else { //버튼으로 시간을 맞출 수 없을 때
            System.out.println(-1);
        }

    }
}

