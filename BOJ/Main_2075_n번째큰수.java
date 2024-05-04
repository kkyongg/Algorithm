package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main_2075_n번째큰수 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine()); //n번째 큰 수

        StringTokenizer st;
        Queue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder()); //내림차순 정렬

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                queue.offer(Integer.parseInt(st.nextToken()));
            }
        }

        int count = 0; //n과 비교(몇번째 큰 수인지)
        int result = 0;

        while (count != n) {
            result = queue.poll();
            count++;
        }

        System.out.println(result);
    }
}