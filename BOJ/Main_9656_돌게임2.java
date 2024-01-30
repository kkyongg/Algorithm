package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_9656_돌게임2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int stone = Integer.parseInt(br.readLine());

        //1개 또는 3개 가져감, 마지막 돌 가져가는 사람이 짐
        int count = 0;
        while (stone != 0) {
            if (stone > 3) {
                stone -= 3;
            } else {
                stone -= 1;
            }
            count++;
        }
        //count : 순서 의미 -> 짝수면 상근, 홀수면 창영 승
        if (count % 2 == 0) {
            System.out.println("SK");
        } else {
            System.out.println("CY");
        }
    }
}

