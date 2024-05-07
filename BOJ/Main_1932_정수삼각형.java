package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_1932_정수삼각형 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine()); //삼각형 크기

        int[][] arr = new int[n][n]; //정수 삼각형의 배열
        int[][] result = new int[n][n]; //최댓값 구하기 위한 배열

        StringTokenizer st;
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < i + 1; j++) { //삼각형 값 입력, 입력 되지 않은 나머지는 0
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        //밑에서 부터 확인해야 하기 때문에 맨 밑줄 값 저장
        for (int i = 0; i < n; i++) {
            result[n - 1][i] = arr[n - 1][i];
        }

        //두 개의 수를 비교해서 그 중 큰 수와 그 윗줄의 값을 더해서 result 에 저장
        //n=5 일 때
        for (int i = n - 1; i >= 0; i--) { // 4 3 2 1 0
            for (int j = 0; j < i; j++) { // 0 1 2 3, 0 1 2, 0 1, 0
                result[i - 1][j] = Math.max(result[i][j], result[i][j + 1]) + arr[i - 1][j];
            }
        }

        System.out.println(result[0][0]);
    }
}
