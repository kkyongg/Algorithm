package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Baekjoon_3052 {
    public static void main(String[] args) throws IOException {
        //수 10개 입력받음
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        Map<Integer, Integer> map = new HashMap<>(); //중복 허용 X
        int input;
        int result;
        for (int i = 0; i < 10; i++) {
            input = Integer.parseInt(bufferedReader.readLine());
            result = input % 42;
            map.put(result, result);
        }
        System.out.println(map.size());
    }
}
