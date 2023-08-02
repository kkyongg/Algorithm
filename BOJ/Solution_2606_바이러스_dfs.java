package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_2606_바이러스_dfs {
    static int[][] map;
    static boolean[] visited;
    static int computers, connectedComputers;
    static int count = 0;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        computers = Integer.parseInt(br.readLine());
        connectedComputers = Integer.parseInt(br.readLine());

        map = new int[computers + 1][computers + 1];
        visited = new boolean[computers + 1];

        StringTokenizer st;
        for (int i = 0; i < connectedComputers; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            map[a][b] = map[b][a] = 1;
        }
        System.out.println(dfs(1));
    }

    public static int dfs(int i) {

        visited[i] = true;

        for (int j = 1; j <= computers; j++) {
            if (map[i][j] == 1 && visited[j] == false) {
                count++;
                dfs(j);
            }
        }

        return count;
    }
}
