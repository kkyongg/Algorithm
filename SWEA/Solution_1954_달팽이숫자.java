package SWEA;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution_1954_달팽이숫자 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(br.readLine());

        for (int t = 0; t < testCase; t++) {
            int n = Integer.parseInt(br.readLine());

            StringBuilder result = solution(n);
            System.out.println("#" + (t + 1));
            System.out.println(result);

        }
    }

    public static StringBuilder solution(int n) {
        StringBuilder result = new StringBuilder();
        int[][] arr = new int[n][n];

        int num = 1;
        int x = 0;
        int y = 0;
        //우, 하, 좌, 상
        int[] dx = {0, 1, 0, -1};
        int[] dy = {1, 0, -1, 0};
        int dir = 0;

        while (num <= n * n) {
            arr[x][y] = num++;
            x = x + dx[dir];
            y = y + dy[dir];

            if (x > n - 1 || y > n - 1 || x < 0 || y < 0 || arr[x][y] != 0) {
                //다시 제자리로 이동
                x = x - dx[dir];
                y = y - dy[dir];

                dir = (dir + 1) % 4; //방향 바꾸기

                //방향 바뀐 후 이동
                x = x + dx[dir];
                y = y + dy[dir];
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                result.append(arr[i][j]).append(" ");
            }
            if (i < n - 1) result.append("\n");
        }

        return result;
    }
}
