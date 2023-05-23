package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_10974_모든순열 {

    public static int num;
    public static int[] numbers;
    public static int[] input; //뽑을 숫자 넣을 배열
    public static boolean[] isSelected;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        num = Integer.parseInt(br.readLine());
        numbers = new int[num];
        input = new int[num];
        isSelected = new boolean[num];

        for (int i = 0; i < num; i++) {
            numbers[i] = i + 1;
        }

        permutation(0);
    }

    public static void permutation(int cnt) {

        StringBuilder sb = new StringBuilder();
        if (cnt == num) {
            for (int i = 0; i < input.length; i++) {
                sb.append(input[i] + " ");
            }
            System.out.println(sb);
            return;
        }
        for (int i = 0; i < num; i++) {

            if (isSelected[i]) continue;

            input[cnt] = numbers[i];
            isSelected[i] = true;

            permutation(cnt + 1);
            isSelected[i] = false;

        }

    }
}

