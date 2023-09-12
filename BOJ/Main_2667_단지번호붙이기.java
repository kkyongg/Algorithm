package BOJ;

import java.awt.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.List;

public class Main_2667_단지번호붙이기 {

    public static int[][] map;
    public static boolean[][] visited;
    public static int n;
    public static List<Integer> list = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());

        map = new int[n][n];
        visited = new boolean[n][n];

        for (int i = 0; i < n; i++) {
            String str = br.readLine();
            for (int j = 0; j < n; j++) {
                map[i][j] = str.charAt(j) - '0';

            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (map[i][j] == 1 && !visited[i][j]) {
                    bfs(i, j);
                }
            }
        }

        Collections.sort(list);
        System.out.println(list.size());
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

    public static void bfs(int x, int y) {
        int[] dx = {-1, 0, 1, 0};
        int[] dy = {0, -1, 0, 1};

        Queue<Point> queue = new LinkedList<>();
        queue.offer(new Point(x, y));
        visited[x][y] = true;
        int cnt = 0;

        while (!queue.isEmpty()) {
            Point now = queue.poll();
            cnt++;
            for (int i = 0; i < 4; i++) {
                x = now.x + dx[i];
                y = now.y + dy[i];

                if (x < 0 || x > n - 1 || y < 0 || y > n - 1) continue;

                if (map[x][y] == 1 && !visited[x][y]) {
                    visited[x][y] = true;
                    queue.offer(new Point(x, y));
                }
            }
        }
        list.add(cnt);
    }
}

