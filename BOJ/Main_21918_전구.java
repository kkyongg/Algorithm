package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_21918_전구 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int bulb = Integer.parseInt(st.nextToken()); //전구 갯수
        int input = Integer.parseInt(st.nextToken()); //명령 수
        int[] bulbs = new int[bulb]; //전구 상태

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < bulb; i++) {
            bulbs[i] = Integer.parseInt(st.nextToken());
        }

        for (int j = 0; j < input; j++) {
            st = new StringTokenizer(br.readLine());

            int order = Integer.parseInt(st.nextToken());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());

            switch (order) {
                case 1: //n번째 전구를 m 상태로
                    bulbs[n - 1] = m;
                    break;
                case 2: //반대상태로
                    for (int i = n; i <= m; i++) {
                        bulbs[i - 1] ^= 1;
                    }
                    break;
                case 3: //끄기(0)
                    for (int i = n; i <= m; i++) {
                        bulbs[i - 1] = 0;
                    }
                    break;
                case 4: //켜기(1)
                    for (int i = n; i <= m; i++) {
                        bulbs[i - 1] = 1;
                    }
                    break;
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < bulbs.length; i++) {
            sb.append(bulbs[i]).append(" ");
        }

        System.out.println(sb);
    }
}
