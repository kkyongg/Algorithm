package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_2775_부녀회장이될테야 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[][] apt = new int[15][15];

        for (int i = 0; i < 15; i++) {
            apt[i][1] = 1; //모든 층 1호는 1명
            apt[0][i] = i; //0층: i호 i명
        }

        for (int i = 1; i < 15; i++) { //층
            for (int j = 2; j < 15; j++) { //호
                apt[i][j] = apt[i - 1][j] + apt[i][j - 1]; //i층 j호 사람 수 = (i-1)층 1호부터 j호 까지 사람수의 합
            }
        }

        int testCase = Integer.parseInt(br.readLine());

        for (int i = 0; i < testCase; i++) {
            int k = Integer.parseInt(br.readLine()); //층
            int n = Integer.parseInt(br.readLine()); //호
            System.out.println(apt[k][n]);
        }

    }
}

