package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main_11866_요세푸스문제0 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int number = Integer.parseInt(st.nextToken()); //사람 수
        int k = Integer.parseInt(st.nextToken());

        Queue<Integer> queue = new LinkedList<>();

        for (int i = 0; i < number; i++) {
            queue.offer(i + 1);
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 1; i < k * number + 1; i++) { //모든 인원이 제거되기 위한 최대 반복 횟수 k * number
            if (!queue.isEmpty()) {
                int n = queue.poll();

                if (i % k == 0) { //k번째 사람이라면 제거
                    if (queue.size() == 0) sb.append(n); //마지막 사람이면 뒤에 쉼표 없어야함
                    else sb.append(n).append(", ");
                } else {
                    queue.offer(n);
                }
            } else break;
        }

        System.out.println("<" + sb + ">");
    }
}
