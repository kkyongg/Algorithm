package baekjoon.Programmers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Programmers_더맵게 {
    public static void main(String[] args) throws IOException {


        int[] scoville = new int[]{1, 2, 3, 9, 10, 12};
        int K = 7;
        int result = Solution(scoville, K);
        System.out.println(result);

    }

    public static int Solution(int[] scoville, int K) {
        int answer = 0;

        PriorityQueue<Integer> queue = new PriorityQueue<>();

        for (int i = 0; i < scoville.length; i++) {
            queue.add(scoville[i]);
        }

        while (queue.peek() < K && queue.size() >= 2) {
            int first = queue.peek(); //1
            queue.poll(); //1 삭제
            int second = queue.peek(); //2
            queue.poll(); //2 삭제
            int sum = first + (second * 2); //5
            queue.add(sum); //3, 5, 9, 10, 12
            answer++;

        }

        if (queue.peek() < K) {
            answer = -1;
        }

        return answer;
    }


}
