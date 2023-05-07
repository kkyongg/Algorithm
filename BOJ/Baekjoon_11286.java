package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class Baekjoon_11286 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int input = Integer.parseInt(bufferedReader.readLine());
        PriorityQueue<Integer> queue = new PriorityQueue<>((o1, o2) -> {
            //두 수의 절댓값
            int n1 = Math.abs(o1);
            int n2 = Math.abs(o2);

            //o1에게 높은 우선순위 주고 싶으면 -1, o2에게 높은 우선순위 주고 싶으면 1 return
            if (n1 == n2) {
                if (o1 <= o2) {
                    return -1;
                } else {
                    return 1;
                }
            } else if (n1 < n2) {
                return -1;
            } else {
                return 1;
            }
        });

        for (int i = 0; i < input; i++) {
            int num = Integer.parseInt(bufferedReader.readLine());
            if (num == 0) {
                if (queue.isEmpty()) {
                    System.out.println(0);
                } else {
                    System.out.println(queue.poll());
                }
            } else {
                queue.offer(num);
            }
        }
    }
}
