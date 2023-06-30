package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main_5635_생일 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int testCase = Integer.parseInt(br.readLine());

        String[][] people = new String[testCase][4];
        for (int i = 0; i < testCase; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 4; j++) {
                people[i][j] = st.nextToken();
            }
        }
        Arrays.sort(people, new Comparator<String[]>() {
            @Override
            public int compare(String[] o1, String[] o2) {
                if (Integer.parseInt(o1[3]) == Integer.parseInt(o2[3])) { //연도 비교
                    if (Integer.parseInt(o1[2]) == Integer.parseInt(o2[2])) { //월 비교
                        return Integer.parseInt(o1[1]) - (Integer.parseInt(o2[1])); //일 비교
                    } else {
                        return Integer.parseInt(o1[2]) - (Integer.parseInt(o2[2])); //
                    }
                }
                return Integer.parseInt(o1[3]) - (Integer.parseInt(o2[3]));
            }
        });

        System.out.println(people[testCase - 1][0]);
        System.out.println(people[0][0]);

    }
}

