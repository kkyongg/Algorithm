package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_12904_A와B {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();
        String t = br.readLine();
        int length = t.length();

        // t -> s 로 바꿔서 확인
        for (int i = length - 1; i >= s.length(); i--) {
            char last = t.charAt(i); //마지막 글자
            t = t.substring(0, i); //맨 마지막 글자 제거
            if (last == 'B') {//문자 뒤집기
                t = t.substring(0, i);
                StringBuilder tmp = new StringBuilder();
                for (int j = t.length() - 1; j >= 0; j--) {
                    tmp.append(t.charAt(j));
                }
                t = String.valueOf(tmp);
            }
        }

        if (s.equals(t)) System.out.println(1);
        else System.out.println(0);
    }
}

