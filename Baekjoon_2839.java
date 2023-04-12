package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon_2839 {
    public static void main(String[] args) throws IOException {
        //봉지 3킬로, 5킬로
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int kg = Integer.parseInt(bufferedReader.readLine());

        int bag = 0;
        while (true) {
            if (kg % 5 == 0) { //5의 배수인지 확인
                bag += kg / 5;
                System.out.println(bag);
                break;
            }
            kg -= 3; //5의 배수가 아닐때 -3씩하면서 맞추기
            bag++;

            if (kg < 0) {
                System.out.println(-1);
                break;
            }
        }

        //https://st-lab.tistory.com/72
    }
}
