package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_2644_촌수계산 {
    public static boolean[] visited;
    public static int[][] map;
    public static int people, start, end, result = -1, count = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        people = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        start = Integer.parseInt(st.nextToken());
        end = Integer.parseInt(st.nextToken());

        map = new int[people + 1][people + 1];
        visited = new boolean[people + 1];

        int lines = Integer.parseInt(br.readLine());

        for (int i = 0; i < lines; i++) {
            st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());

            map[n][m] = map[m][n] = 1;
        }
        dfs(start, count);
        System.out.println(result);
    }

    public static void dfs(int start, int count) {
        if (start == end) {
            result = count;
            return;
        }

        visited[start] = true;

        for (int i = 1; i <= people; i++) {
            if (map[start][i] == 1 && !visited[i]) {
                dfs(i, count + 1);
            }
        }
    }
}
