package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_2847_게임을만든동준이 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int level = Integer.parseInt(br.readLine());

        int[] scores = new int[level];
        for (int i = 0; i < level; i++) {
            scores[i] = Integer.parseInt(br.readLine());
        }

        int count = 0;
        //뒤에서부터 확인

        for (int i = scores.length - 1; i > 0; i--) {
            while (scores[i] <= scores[i - 1]) {
                scores[i - 1]--; //레벨 난이도가 낮아질 때까지 반복
                count++; //몇 번 감소했는지 count
            }
        }
        System.out.println(count);
    }
}
