package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Baekjoon_11279 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int inputNum = Integer.parseInt(bufferedReader.readLine());

        Queue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder()); //최댓값이 제일 먼저 나옴
        for (int i = 0; i < inputNum; i++) {
            int add = Integer.parseInt(bufferedReader.readLine());
            if (add == 0) {
                if (queue.isEmpty()) {
                    System.out.println(0);
                } else {
                    System.out.println(queue.poll());
                }

            } else {
                queue.add(add);
            }
        }

    }
}
