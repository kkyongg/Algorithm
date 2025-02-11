package org.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_1913_달팽이 {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		int position = Integer.parseInt(br.readLine());
		int[][] arr = new int[n][n];

		int x = (n / 2);
		int y = (n / 2);
		arr[x][y] = 1;

		int count = 1;

		//오른쪽에서 아래로 방향 바뀔 때, 왼쪽에서 위로 방향 바뀔 때 move + 1
		//상 우 하 좌
		//0번째랑 2번째 인덱스
		int[] dx = {-1, 0, 1, 0};
		int[] dy = {0, 1, 0, -1};

		int index = 0;
		int move = 1;
		while (true) {
			if(count >= n * n) break;

			if(move == n) {
				move --;
			}
			for (int i = 0; i < move; i++) {
				int nx = x + dx[index];
				int ny = y + dy[index];

				arr[nx][ny] = count + 1;
				count++;
				x = nx;
				y = ny;
			}

			index++;

			if(index == 0 || index == 2) {
				move++;
			} else if(index == 4) {
				index = 0;
				move++;
			}

		}
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				sb.append(arr[i][j]).append(" ");
				if(arr[i][j] == position) {
					x = i + 1;
					y = j + 1;
				}
			}
			sb.append("\n");
		}

		System.out.print(sb);
		System.out.println(x + " " + y);
	}
}
