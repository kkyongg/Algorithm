package Programmers;

import java.util.LinkedList;
import java.util.Queue;

class Programmers_다리를지나는트럭 {
    public static void main(String[] args) {

        System.out.println(solution(2, 10, new int[]{7, 4, 5, 6}));
        System.out.println(solution(100, 100, new int[]{10}));
        System.out.println(solution(100, 100, new int[]{10, 10, 10, 10, 10, 10, 10, 10, 10, 10}));

    }

    public static int solution(int bridge_length, int weight, int[] truck_weights) {
        int sum = 0;
        int time = 0;

        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < truck_weights.length; i++) {
            int truck = truck_weights[i];

            while (true) {
                if (queue.isEmpty()) { //다리에 트럭이 없을 경우
                    queue.add(truck);
                    sum += truck;
                    time++;
                    break;

                } else if (queue.size() == bridge_length) { //다리에 올라갈 수 있는 트럭 수가 다 찬 경우
                    sum = sum - queue.poll();

                } else { //다리에 트럭이 있는 경우
                    if (sum + truck <= weight) { //최대하중이 넘지 않는 경우
                        queue.offer(truck);
                        sum = sum + truck;
                        time++;
                        break;

                    } else { //최대하중이 넘는 경우
                        queue.add(0);
                        time++;
                    }
                }
            }
        }
        return bridge_length + time;
    }
}
