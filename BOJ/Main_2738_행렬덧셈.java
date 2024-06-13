package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_2738_행렬덧셈 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[][] arr = new int[n][m];

        for (int j = 0; j < n; j++) { //첫번째 행렬 값 입력
            st = new StringTokenizer(br.readLine());
            for (int k = 0; k < m; k++) {
                arr[j][k] = Integer.parseInt(st.nextToken());
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int j = 0; j < n; j++) {
            st = new StringTokenizer(br.readLine());
            for (int k = 0; k < m; k++) { //두번째 행렬 값을 첫번째 행렬 값에 더하기
                sb.append(Integer.parseInt(st.nextToken()) + arr[j][k] + " ");
            }
            sb.append("\n");
        }

        System.out.println(sb);
    }
}