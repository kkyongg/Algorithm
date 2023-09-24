package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main_22233_가희와키워드 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken()); //메모장에 적은 키워드 개수
        int m = Integer.parseInt(st.nextToken()); //블로그에 쓴 글 개수

        Set<String> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            String keyword = br.readLine();
            set.add(keyword);
        }

        for (int i = 0; i < m; i++) {
            String keyword = br.readLine();
            String[] keywords = keyword.split(",");
            for (int j = 0; j < keywords.length; j++) { //키워드 사용했으면 제거
                set.remove(keywords[j]);
            }
            System.out.println(set.size());
        }
    }
}
