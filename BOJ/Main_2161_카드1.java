package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main_2161_카드1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());
        Queue<Integer> queue = new LinkedList<>();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < num; i++) {
            queue.add(i + 1);
        }

        while (!queue.isEmpty()) {
            int delete = queue.poll();
            sb.append(delete).append(" ");
            if (!queue.isEmpty()) {
                int move = queue.poll();
                queue.add(move);
            } else break;
        }

        System.out.println(sb);

    }
}