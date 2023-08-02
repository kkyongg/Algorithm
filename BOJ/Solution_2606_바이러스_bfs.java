package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Solution_2606_바이러스_bfs {
    static int[][] map;
    static boolean[] visited;
    static int computerNum, networkNum;
    static int count = 0;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        computerNum = Integer.parseInt(br.readLine());
        networkNum = Integer.parseInt(br.readLine());

        map = new int[computerNum + 1][computerNum + 1];
        visited = new boolean[computerNum + 1];

        StringTokenizer st;
        for (int i = 0; i < networkNum; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            map[a][b] = map[b][a] = 1;
        }

        System.out.println(bfs(1));

    }

    public static int bfs(int i) {

        Queue<Integer> queue = new LinkedList<>();
        queue.offer(i);
        visited[i] = true;

        while (!queue.isEmpty()) {
            int temp = queue.poll();

            for (int j = 1; j <= computerNum; j++) {
                if (map[temp][j] == 1 && visited[j] == false) {
                    queue.offer(j);
                    visited[j] = true;
                    count++;
                }
            }
        }
        return count;
    }
}


