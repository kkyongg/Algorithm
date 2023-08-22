package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_2490_윷놀이 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int count;

        for (int i = 0; i < 3; i++) {
            st = new StringTokenizer(br.readLine());
            count = 0;
            //배(0) 또는 등(1)
            for (int j = 0; j < 4; j++) {
                int num = Integer.parseInt(st.nextToken());
                if (num == 0) { //윷이 등(1)일 때 count++
                    count++;
                }
            }
            //도(배 한 개, 등 세 개), 개(배 두 개, 등 두 개), 걸(배 세 개, 등 한 개), 윷(배 네 개), 모(등 네 개)
            if (count == 1) {
                System.out.println("A");
            } else if (count == 2) {
                System.out.println("B");
            } else if (count == 3) {
                System.out.println("C");
            } else if (count == 4) {
                System.out.println("D");
            } else {
                System.out.println("E");
            }
        }
    }
}

