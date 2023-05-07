package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Baekjoon_18258 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int inputCase = Integer.parseInt(bufferedReader.readLine());
        Deque<Integer> deque = new ArrayDeque<>();

        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < inputCase; i++) {
            String[] str = bufferedReader.readLine().split(" ");

            //for문 switch문 시간 차이 별로 없넹ㅋ

            switch (str[0]) {
                case "push":
                    deque.offer(Integer.valueOf(str[1]));
                    break;

                case "front":
                    if (deque.isEmpty()) {
                        stringBuilder.append(-1).append("\n");
                    } else {
                        stringBuilder.append(deque.peek()).append("\n");
                    }
                    break;
                case "back":
                    if (deque.isEmpty()) {
                        stringBuilder.append(-1).append("\n");
                    } else {
                        stringBuilder.append(deque.peekLast()).append("\n");
                    }
                    break;
                case "size":
                    stringBuilder.append(deque.size()).append("\n");
                    break;

                case "pop":
                    if (deque.isEmpty()) {
                        stringBuilder.append(-1).append("\n");
                    } else {
                        stringBuilder.append(deque.poll()).append("\n");
                    }
                    break;
                case "empty":
                    if (deque.isEmpty()) {
                        stringBuilder.append(1).append("\n");
                    } else {
                        stringBuilder.append(0).append("\n");
                    }
                    break;
            }
        }
        System.out.println(stringBuilder);

    }
}
