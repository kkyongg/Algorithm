package SWEA;

import java.io.*;
import java.util.StringTokenizer;

public class Solution_7236_저수지의물의총깊이구하기 {
    static String[][] square;
    static int N;
    static int[] dr = {-1, 0, 1, 0, -1, 1, 1, -1};
    static int[] dc = {0, -1, 0, 1, -1, -1, 1, 1};

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(bufferedReader.readLine());

        StringTokenizer stringTokenizer;

        for (int t = 1; t <= T; t++) { //케이스 수
            N = Integer.parseInt(bufferedReader.readLine());
            square = new String[N][N];

            for (int i = 0; i < N; i++) { //N x N
                stringTokenizer = new StringTokenizer(bufferedReader.readLine());

                for (int j = 0; j < N; j++) {
                    square[i][j] = stringTokenizer.nextToken();
                }
            }
            int answer = Solution(); //square 값을 다 넣은 후에 메서드에 넣어야 함
            System.out.println("#" + t + " " + answer);
        }

    }

    public static int Solution() {
        int max = 0;

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (square[i][j].equals("W")) {
                   int solution_result = Check(i, j);
                    if (max < solution_result) {
                        max = solution_result;
                    }
                }
            }
        }
        return max;
    }

    public static int Check(int r, int c) {
        //현재 위치를 인자로 받아옴
        int count = 0;

        int g_count = 0;
        for (int d = 0; d < 8; d++) {
            int nr = r + dr[d];
            int nc = c + dc[d];
            if (nr < 0 || nc < 0 || nr >= N || nc >= N) continue;
            if (square[nr][nc].equals("W")) {
                count++;
            } else {
                g_count++;
            }
            if (g_count == 8) {
                count = 1;
            }
        }
        return count;
    }
}
