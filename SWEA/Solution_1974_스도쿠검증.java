package SWEA;

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.Arrays;
import java.util.StringTokenizer;

class Solution_1974_스도쿠검증 {
    public static int[][] sudoku;

    public static void main(String args[]) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringTokenizer st;

        for (int t = 1; t < T + 1; t++) {

            sudoku = new int[9][9];
            for (int i = 0; i < 9; i++) { //배열에 값 입력
                st = new StringTokenizer(br.readLine());
                for (int j = 0; j < 9; j++) {
                    int num = Integer.parseInt(st.nextToken());
                    sudoku[i][j] = num;
                }
            }

            //행, 열 체크
            boolean row_answer = true;
            boolean column_answer = true;

            for (int i = 0; i < 9; i++) {
                int[] column = new int[9];
                int[] row = new int[9];

                for (int c = 0; c < 9; c++) {
                    row[c] = sudoku[i][c]; //행
                    column[c] = sudoku[c][i]; //열
                }
                row_answer = checkLine(row);
                column_answer = checkLine(column);
                if (!column_answer || !row_answer) break;
            }

            //각 3x3 정사각형 체크
            boolean square_answer = checkSquare();

            if (column_answer && row_answer && square_answer) {
                System.out.println("#" + t + " " + 1);
            } else {
                System.out.println("#" + t + " " + 0);
            }
        }
    }


    public static boolean checkLine(int[] line) {
        boolean answer = true;
        //오름차순 정렬 후 1부터 9까지 확인
        Arrays.sort(line);
        for (int i = 0; i < 9; i++) {
            if (line[i] == i + 1) continue;
            else {
                answer = false;
                break;
            }
        }
        return answer;
    }

    public static boolean checkSquare() {
        boolean suqare_answer = true;

        for (int i = 0; i <= 6; i += 3) {
            for (int j = 0; j <= 6; j += 3) {
                int[] square = new int[9];
                int r = i + 3;
                int c = j + 3;

                for (int sr = i; sr < r; sr++) { // 3x3씩 확인
                    for (int sc = j; sc < c; sc++) {
                        square[sudoku[sr][sc] - 1]++; //숫자가 1부터 9까지니까 -1 해줌
                    }
                }
                for (int k = 0; k < 9; k++) {
                    if (square[k] == 0) {
                        suqare_answer = false;
                        break;
                    }
                }
            }
        }

        return suqare_answer;
    }
}
