package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Objects;
import java.util.StringTokenizer;

public class Baekjoon_10814 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(bufferedReader.readLine());

        String[][] member = new String[testCase][2];
        StringTokenizer stringTokenizer;

        for (int i = 0; i < testCase; i++) {
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());

            int age = Integer.parseInt(stringTokenizer.nextToken());
            String name = stringTokenizer.nextToken();

            member[i][0] = String.valueOf(age);
            member[i][1] = name;
        }

        //나이 순으로 정렬
        Arrays.sort(member, new Comparator<String[]>() {
            @Override
            public int compare(String[] o1, String[] o2) {

                if (Objects.equals(o1[0], o2[0])) {
                    return 0; //리턴값이 양수면 앞에 있는 o1이 먼저 정렬
                    // ** 리턴을 0으로 해서 순서 유지 시켜야함 1로 했을 때 런타임 에러 ;;;; ??;;
                } else {
                    //나이가 다르면 두 나이를 빼서 양수 음수를 따져서 정렬
                    return Integer.parseInt(o1[0]) - Integer.parseInt(o2[0]);
                }
            }
        });

        for (int i = 0; i < testCase; i++) {
            System.out.println(member[i][0] + " " + member[i][1]);
        }
    }
}
