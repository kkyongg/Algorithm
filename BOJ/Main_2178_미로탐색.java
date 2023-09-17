package BOJ;

import java.awt.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main_2178_미로탐색 {
    public static int n, m;
    public static int[][] map;
    public static boolean[][] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        map = new int[n][m];

        for (int i = 0; i < n; i++) {
            String num = br.readLine();
            for (int j = 0; j < num.length(); j++) {
                map[i][j] = num.charAt(j) - '0';
            }
        }

        visited = new boolean[n][m];
        bfs(0, 0);
        System.out.println(map[n - 1][m - 1]);

    }

    public static void bfs(int x, int y) {
        int[] dx = {0, -1, 0, 1};
        int[] dy = {-1, 0, 1, 0};

        Queue<Point> queue = new LinkedList<>();
        queue.offer(new Point(x, y));
        visited[x][y] = true;

        while (!queue.isEmpty()) {
            Point point = queue.poll();

            for (int i = 0; i < 4; i++) {
                x = point.x + dx[i];
                y = point.y + dy[i];

                if (x < 0 || x >= n || y < 0 || y >= m) continue;

                if (map[x][y] == 1 && !visited[x][y]) {
                    queue.offer(new Point(x, y));
                    visited[x][y] = true;
                    map[x][y] = map[point.x][point.y] + 1;
                }
            }
        }
    }
}


