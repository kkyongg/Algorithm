package BOJ;

import java.awt.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.List;

public class Main_2583_영역구하기 {
    public static int n, m;
    public static int[][] map;
    public static boolean[][] visited;
    public static List<Integer> list = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        map = new int[m][n];
        visited = new boolean[m][n];
        int t = Integer.parseInt(st.nextToken());


        for (int i = 0; i < t; i++) {
            st = new StringTokenizer(br.readLine());
            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());

            for (int y = y1; y < y2; y++) {
                for (int x = x1; x < x2; x++) {
                    visited[x][y] = true;
                    map[x][y] = 1;
                }
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (map[i][j] == 0 && !visited[i][j]) {
                    visited[i][j] = true;
                    bfs(i, j);
                }
            }
        }

        Collections.sort(list);
        System.out.println(list.size());
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
    }

    public static void bfs(int x, int y) {
        int[] dx = {0, -1, 0, 1};
        int[] dy = {-1, 0, 1, 0};

        Queue<Point> queue = new LinkedList<>();
        queue.offer(new Point(x, y));
        int count = 0;

        while (!queue.isEmpty()) {
            Point point = queue.poll();
            count++;

            for (int i = 0; i < 4; i++) {
                x = point.x + dx[i];
                y = point.y + dy[i];

                if (x < 0 || x > m - 1 || y < 0 || y > n - 1) continue;

                if (map[x][y] == 0 && !visited[x][y]) {
                    queue.offer(new Point(x, y));
                    visited[x][y] = true;
                }
            }
        }
        list.add(count);
    }
}
