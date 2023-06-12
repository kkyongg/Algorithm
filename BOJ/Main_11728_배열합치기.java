package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main_11728_배열합치기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(st.nextToken()); //배열 a 크기
        int m = Integer.parseInt(st.nextToken()); //배열 b 크기

        List<Integer> list = new ArrayList<>();
        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(st.nextToken());
            list.add(num);
        }
        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < m; i++) {
            int num = Integer.parseInt(st.nextToken());
            list.add(num);
        }

        Collections.sort(list);

        for (int i = 0; i < list.size(); i++) {
            sb.append(list.get(i)).append(" ");
        }

        System.out.println(sb);

    }
}
