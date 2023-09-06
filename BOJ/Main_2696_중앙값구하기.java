package BOJ;

import java.io.*;
import java.util.*;

public class Main_2696_중앙값구하기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;

        int testCase = Integer.parseInt(br.readLine());
        while (testCase-- > 0) {
            PriorityQueue<Integer> minHeap = new PriorityQueue<>(); //오름차순
            PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder()); //내림차순

            int nums = Integer.parseInt(br.readLine());
            System.out.println((nums + 1) / 2); //중앙값 개수

            int cnt = 1; //출력 10개 제한 확인하기 위해

            for (int j = 0; j < nums; j++) {
                if (j % 10 == 0) {
                    st = new StringTokenizer(br.readLine());
                }
                int num = Integer.parseInt(st.nextToken());

                if (minHeap.size() == maxHeap.size()) {
                    maxHeap.offer(num);
                } else {
                    minHeap.offer(num);
                }

                //maxHeap 에는 중간값 이하의 수만 존재하도록
                if (!minHeap.isEmpty()) {
                    if (maxHeap.peek() > minHeap.peek()) {
                        int num1 = maxHeap.poll();
                        int num2 = minHeap.poll();

                        maxHeap.offer(num2);
                        minHeap.offer(num1);
                    }
                }

                if (j % 2 == 0) { //인텍스는 0부터 시작해서 짝수번째일 때 중앙값 출력
                    if (cnt == 10 || j == nums - 1) { //한 줄에 최대 10개
                        System.out.println(maxHeap.peek());
                        cnt = 0;
                    } else {
                        System.out.print(maxHeap.peek() + " ");
                    }
                    cnt++;
                }
            }
        }
    }
}