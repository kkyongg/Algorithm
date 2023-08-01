package Programmers;

import java.util.*;

public class Programmers_프로세스 {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{2, 1, 3, 2}, 2));
        System.out.println(solution(new int[]{1, 1, 9, 1, 1, 1}, 0));
    }

    public static int solution(int[] priorities, int location) {

        Queue<Integer> queue = new LinkedList<>();
        Queue<String> alphabetQueue = new LinkedList<>();
        Queue<Integer> priorityQueue = new PriorityQueue<>(Collections.reverseOrder());

        for (int i = 0; i < priorities.length; i++) {
            queue.offer(priorities[i]);
            priorityQueue.offer(priorities[i]);
        }

        //대기중인 프로세스 순서에 맞게 A,B,C,D.. 로 알파벳 담기
        char ch = 65; //'A'
        int locationIndex = 0;
        String locationToAlphabet = "null";

        while (locationIndex != priorities.length) {
            locationIndex++;
            String str = String.valueOf(ch);
            alphabetQueue.offer(str);
            ch++;
            if (locationIndex - 1 == location) {
                locationToAlphabet = str; //location에 해당하는 프로세스를 알파벳으로 기억
            }
        }

        List<String> list = new ArrayList<>(); //꺼내진 프로세스 순서로 담을 list
        int max = priorityQueue.poll(); //우선순위 제일 높은 수

        while (!queue.isEmpty()) {
            int num = queue.poll();
            String str = alphabetQueue.poll();

            if (priorityQueue.size() == 0) { //queue 마지막 원소인 경우
                list.add(str);
            }

            //num(현재 위치의 프로세스) 보다 높은 우선순위 프로세스가 있는지 priorityQueue 와 비교
            if (!priorityQueue.isEmpty()) {
                if (num != max) { //중요도가 더 높은 프로세스가 있다면
                    queue.offer(num);
                    alphabetQueue.offer(str);

                } else { //가장 높은 중요도인 프로세스라면
                    list.add(str); // -> 실행된 프로세스 순서대로 list에 add
                    max = priorityQueue.poll(); // 다음 우선순위 확인
                }
            }
        }

        int answer = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(locationToAlphabet)) { //찾아야 할 프로세스가 몇번째로 꺼내졌는지 확인
                answer = i + 1;
            }
        }

        return answer;
    }
}

