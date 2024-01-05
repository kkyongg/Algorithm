package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main_2346_풍선터뜨리기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.parseInt(br.readLine()); //풍선 개수

        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] values = new int[input]; //풍선에 들어있는 값들
        for (int i = 0; i < input; i++) {
            values[i] = Integer.parseInt(st.nextToken());
        }

        Deque<Balloon> deque = new ArrayDeque<>();
        StringBuilder sb = new StringBuilder();
        sb.append(("1 ")); //무조건 1번 풍선 먼저
        for (int i = 1; i < input; i++) {
            deque.add(new Balloon(i + 1, values[i]));
        }

        int first = values[0]; //첫번째 풍선 숫자만큼 이동해야함
        while (!deque.isEmpty()) {
            if (first > 0) { //양수면
                for (int i = 1; i < first; i++) {
                    deque.add(deque.poll()); //순서대로 add
                }
                Balloon next = deque.poll();
                first = next.num; //이동해야하는 값
                sb.append(next.index + " "); //풍선의 위치 append

            } else { //음수면
                for (int i = 1; i < -first; i++) {
                    deque.addFirst(deque.pollLast()); //앞으로 add
                }
                Balloon next = deque.pollLast();
                first = next.num; //이동해야하는 값
                sb.append(next.index + " "); //풍선의 위치 append
            }
        }
        System.out.println(sb);
    }
}

class Balloon { //풍선 인덱스와 값을 저장하는 클래스 생성
    int index;
    int num;

    public Balloon(int index, int num) {
        this.index = index;
        this.num = num;
    }
}


