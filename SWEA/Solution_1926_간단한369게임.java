package SWEA;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution_1926_간단한369게임 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int lastNum = Integer.parseInt(br.readLine());
        StringBuilder result = new StringBuilder();

        for (int i = 1; i <= lastNum; i++) {
            //3 6 9가 포함된 숫자라면
            if (String.valueOf(i).contains("3") || String.valueOf(i).contains("6") || String.valueOf(i).contains("9")) {
                //3 6 9는 "-"로, 나머지 숫자는 ""로
                String change = String.valueOf(i).replaceAll("[369]", "-");
                result.append(change.replaceAll("[0124578]", "")).append(" ");
            } else {
                result.append(i).append(" ");
            }
        }

        System.out.println(result);
    }
}
