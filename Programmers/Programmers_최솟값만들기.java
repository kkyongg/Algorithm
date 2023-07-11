package Programmers;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class Programmers_최솟값만들기 {
    public static void main(String[] args) {

        System.out.println(solution(new int[]{1, 4, 2}, new int[]{5, 4, 4}));
        System.out.println(solution(new int[]{1, 2}, new int[]{3, 4}));

    }

    public static int solution(int[] A, int[] B) {

        Queue<Integer> queueA = new PriorityQueue<>(); //오름차순 정렬
        Queue<Integer> queueB = new PriorityQueue<>(Collections.reverseOrder()); //내림차순 정렬

        for (int i = 0; i < A.length; i++) {
            queueA.add(A[i]);
        }
        for (int i = 0; i < B.length; i++) {
            queueB.add(B[i]);
        }

        int answer = 0;
        while (!queueA.isEmpty() && !queueB.isEmpty()) {

            answer = answer + (queueA.poll() * queueB.poll());

        }

        return answer;
    }
}
