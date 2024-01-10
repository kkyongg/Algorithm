package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main_1448_삼각형만들기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[] triangle = new int[N];
        for (int i = 0; i < N; i++) {
            triangle[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(triangle); //오름차순 정렬

        for (int i = triangle.length - 3; i >= 0; i--) { //뒤에서 세번째 인덱스부터 확인
            if (triangle[i] + triangle[i + 1] > triangle[i + 2]) {
                System.out.println(triangle[i] + triangle[i + 1] + triangle[i + 2]);
                return;
            }
        }
        //삼각형 성립 조건 안될 시
        System.out.println(-1);

    }
}

