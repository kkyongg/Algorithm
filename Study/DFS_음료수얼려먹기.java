package Study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class DFS_음료수얼려먹기 {
    public static int n, m;
    public static int[][] graph = new int[1000][1000];

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        //그래프 정보 입력받기
        for (int i = 0; i < n; i++) {
            String line = br.readLine();
            for (int j = 0; j < m; j++) {
                graph[i][j] = line.charAt(j) - '0';
            }
        }

        //모든 노드에 대해 dfs 수행
        int answer = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (dfs(i, j)) {
                    answer++;

                }
            }
        }

        System.out.println(answer);

    }

    public static boolean dfs(int x, int y) {
        //범위 밖인 경우 종료
        if (x < 0 || x >= n || y < 0 || y >= m) {
            return false;
        }

        //미방문 노드일 경우
        if (graph[x][y] == 0) {
            graph[x][y] = 1; //방문 처리
            //상 하 좌 우 모든 노드 방문
            dfs(x - 1, y);
            dfs(x + 1, y);
            dfs(x, y - 1);
            dfs(x, y + 1);
            return true;

        }

        return false;

    }

}

