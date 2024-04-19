package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_1748_수이어쓰기1 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        //n 입력 받으면 1부터 count++ 해서 StringBuilder 에 append 하기 -> 메모리초과

        //1~9까지는 1씩, 10~99까지는 2씩 ... 자릿수 더해주기
        int length = 10;
        int cnt = 1;
        int result = 0;

        for (int i = 1; i <= n; i++) {
            if(i == length) {
                length *= 10;
                cnt++;
            }
            result += cnt;
        }
        System.out.println(result);
    }
}

