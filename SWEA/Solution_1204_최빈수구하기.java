package SWEA;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Solution_1204_최빈수구하기 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(br.readLine());

        StringTokenizer st;
        for (int i = 0; i < testCase; i++) {
            int max = 0;
            int maxScore = 0;

            int testNum = Integer.parseInt(br.readLine());
            Map<Integer, Integer> scoreMap = new HashMap<>();

            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 10; j++) { //1000명
                int score = Integer.parseInt(st.nextToken());

                if (scoreMap.containsKey(score)) {
                    scoreMap.put(score, scoreMap.get(score) + 1);
                } else {
                    scoreMap.put(score, 1);
                }
            }

            List<Map.Entry<Integer, Integer>> entryList = new LinkedList<>(scoreMap.entrySet());
            for (Map.Entry<Integer, Integer> entry : entryList) { //value, key 둘다 할 수 있음
                if (max < entry.getValue()) {
                    maxScore = entry.getKey(); //우리가 출력해야 하는 것. key. 점수
                    max = entry.getValue(); //비교해야 하는 것. value. 인원
                }
                if (max == entry.getValue()) { //같은 value 값이라면 key 값이 큰 값으로 출력
                    if (maxScore < entry.getKey()) {
                        maxScore = entry.getKey();
                        max = entry.getValue();
                    }
                }
            }

            System.out.println("#" + testNum + " " + maxScore);

        }
    }
}