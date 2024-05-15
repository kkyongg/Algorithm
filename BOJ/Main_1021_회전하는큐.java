package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main_1021_회전하는큐 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        //큐의 크기 n, 뽑아내려고 하는 수 m
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        LinkedList<Integer> queue = new LinkedList<>();
        for (int i = 1; i <= n; i++) {
            queue.add(i);
        }

        //뽑아내려는 수의 위치
        int[] arr = new int[m];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < m; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int cost = 0; //출력할 최소연산 값
        for (int i = 0; i < m; i++) {
            int num = arr[i]; //뽑으려는 수의 위치

            int index = queue.indexOf(num);
            int size = queue.size() / 2;

            if (index <= size) { //오른쪽으로 이동할 때 더 가까운 경우
                while (num != queue.peek()) {
                    queue.addLast(queue.pollFirst());
                    cost++;
                }
            } else { //왼쪽으로 이동할 때 더 가까운 경우
                while (num != queue.peek()) {
                    queue.addFirst(queue.pollLast());
                    cost++;
                }
            }
            queue.removeFirst(); //해당 수 뽑을 땐 연산 카운트 x
        }

        System.out.println(cost);
    }
}
