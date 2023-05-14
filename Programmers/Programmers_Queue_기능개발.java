package Programmers;

import java.util.*;

public class Programmers_Queue_기능개발 {
    public static void main(String[] args) {
        int[] progresses2 = {93, 30, 55};
        int[] speeds2 = {1, 30, 5};
        int[] answer2 = solution(progresses2, speeds2);
        System.out.println(Arrays.toString(answer2));

        int[] progresses1 = {95, 90, 99, 99, 80, 99};
        int[] speeds1 = {1, 1, 1, 1, 1, 1};
        int[] answer1 = solution(progresses1, speeds1);
        System.out.println(Arrays.toString(answer1));
    }

    public static int[] solution(int[] progresses, int[] speeds) {

        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < progresses.length; i++) {
            int days = (100 - progresses[i]) / speeds[i];

            if ((100 - progresses[i]) % speeds[i] == 0) {
                queue.add(days);
            } else {
                queue.add(days + 1);
            }
        }
        int count = 0;
        List<Integer> list = new ArrayList<>();
        while (!queue.isEmpty()) {

            int first = queue.poll();
            count++;

            while (!queue.isEmpty() && first >= queue.peek()) {
                queue.poll();
                count++;
            }
            list.add(count);
            count = 0;
        }

        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }
}
