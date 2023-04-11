package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Baekjoon_10610 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String input = bufferedReader.readLine();

        StringBuilder stringBuilder = new StringBuilder();

        List<Integer> list = new ArrayList<>(input.length());
        for (int i = 0; i < input.length(); i++) {
            list.add(input.charAt(i) - '0'); ////ex) 320을 3,2,0 으로 저장
        }

        //각 자릿수의 합이 3의 배수여야 30의 배수이기 때문에 각 자릿수의 합을 구함
        int listSum = 0;
        for (int i = 0; i < list.size(); i++) {
            listSum += list.get(i);
        }

        //30의 배수이기 위해선 0이 포함되어야 함
        if (!list.contains(0) || (listSum % 3) != 0) {
            System.out.println(-1);
        } else {
            Collections.sort(list, Collections.reverseOrder()); //내림차순으로 0을 맨 뒤로 보내기
            for (int i = 0; i < list.size(); i++) {
                stringBuilder.append(list.get(i));
            }
        }
        System.out.println(stringBuilder);

    }
}

