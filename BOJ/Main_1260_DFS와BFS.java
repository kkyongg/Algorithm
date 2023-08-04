package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main_1260_DFS와BFS {
    static int n, m, v;
    static int[][] map;
    static boolean[] visited;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        v = Integer.parseInt(st.nextToken());

        map = new int[n + 1][n + 1];
        visited = new boolean[n + 1];

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            map[a][b] = map[b][a] = 1;
        }

        dfs(v);
        Arrays.fill(visited, false);
        System.out.println();

        bfs(v);

    }

    public static void dfs(int i) {
        visited[i] = true;
        System.out.print(i + " ");

        for (int j = 1; j <= n; j++) {
            if (map[i][j] == 1 && visited[j] == false) {
                dfs(j);
            }
        }

    }

    public static void bfs(int i) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(i);
        visited[i] = true;

        while (!queue.isEmpty()) {
            int temp = queue.poll();
            System.out.print(temp + " ");

            for (int j = 1; j <= n; j++) {
                if (map[temp][j] == 1 && visited[j] == false) {
                    queue.offer(j);
                    visited[j] = true;
                }
            }
        }
    }
}
