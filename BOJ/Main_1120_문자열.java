package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_1120_문자열 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        String a = st.nextToken();
        String b = st.nextToken();

        if (a.length() == b.length()) {
            int result = 0;

            for (int i = 0; i < a.length(); i++) {
                if (a.charAt(i) == b.charAt(i)) result++;
            }

            System.out.println(a.length() - result);

        } else { //a 길이가 b 보다 작은 경우

            //a가 b에 다 포함되는 경우
            if (b.contains(a)) {
                System.out.println(0);
            } else {
                //a 길이에 맞게 b 첫글자부터 비교
                int min = a.length();
                for (int i = 0; i <= b.length() - a.length(); i++) {
                    int tmp = 0;
                    for (int j = 0; j < a.length(); j++) {
                        if (a.charAt(j) != b.charAt(i + j)) //차이를 구해야함
                            tmp++;
                    }
                    min = Math.min(min, tmp);
                }
                System.out.println((min));
            }
        }
    }
}

