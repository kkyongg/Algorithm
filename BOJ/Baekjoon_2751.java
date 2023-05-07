package BOJ;

import java.io.*;
import java.util.*;

public class Baekjoon_2751 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int testCase = Integer.parseInt(bufferedReader.readLine());

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < testCase; i++) {
            list.add(Integer.valueOf(bufferedReader.readLine()));
        }

        Collections.sort(list); //오름차순 정렬

        for (int i = 0; i < list.size(); i++) {
            bufferedWriter.write(list.get(i) + "\n");
        }

        bufferedReader.close();
        bufferedWriter.close();
    }
}
