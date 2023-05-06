package baekjoon.Programmers;

import java.util.HashMap;
import java.util.Map;

public class Programmers_완주하지못한선수 {
    public static void main(String[] args) {

        String[] participant = new String[]{"mislav", "stanko", "eden", "ana"};
        String[] completion = new String[]{"stanko", "ana", "mislav"};

        String answer = Solution(participant, completion);
        System.out.println(answer);

    }

    public static String Solution(String[] participant, String[] completion) {
        String answer = "";

        //해시 이용
        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < participant.length; i++) {

            if(map.containsKey(participant[i])) { //만약 동명이인이 있다면 value 값 +1
                map.put(participant[i],map.get(participant[i])+1);
            } else {
                map.put(participant[i],1);
            }

        }

        for (int i = 0; i < completion.length; i++) {
            if(map.containsKey(completion[i])) {
                if (map.get(completion[i]) == 1) { //동명이인 없을 때
                    map.remove(completion[i]);
                } else { //동명이인 있을 때
                    map.put(completion[i], map.get(completion[i]) - 1);
                }
            }
        }

        //완주 못한 사람만 map에 남아 있음
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            answer = entry.getKey();
        }

        return answer;
    }
}
