package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main_11724_연결요소의개수 {
    public static int[][] map;
    public static boolean[] visited;
    public static int n, m, result = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken()); //정점 개수
        m = Integer.parseInt(st.nextToken()); //간선 개수

        map = new int[n + 1][n + 1];
        visited = new boolean[n + 1];

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            map[a][b] = map[b][a] = 1;
        }

        for (int i = 1; i <= n; i++) {
            if (!visited[i]) {
                bfs(i);
                result++;
            }
        }

        System.out.println(result);
    }

    public static void bfs(int i) {
        Queue<Integer> queue = new ArrayDeque<>();
        queue.offer(i);
        visited[i] = true;

        while (!queue.isEmpty()) {
            int num = queue.poll();
            for (int j = 1; j <= n; j++) {
                if (map[num][j] == 1 && !visited[j]) {
                    queue.offer(j);
                    visited[j] = true;
                }
            }
        }
    }
}

