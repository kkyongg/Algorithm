package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_1138_한줄로서기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine()); //사람 수
        int[] order = new int[n]; //1부터 키 순서대로 자신보다 큰 사람이 왼쪽에 몇 명 있는지

        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < order.length; i++) {
            order[i] = Integer.parseInt(st.nextToken());
        }

        int[] ans = new int[n];

        for (int i = 0; i < n; i++) {
            int cnt = 0;

            for (int j = 0; j < n; j++) {
                if (i == 0) { // 키가 1인 사람의 위치
                    ans[order[i]] = 1;
                    break;
                }

                if (ans[j] == 0) { //해당 위치가 비었다면
                    //나보다 큰 사람이 들어가야 할 위치인지 cnt와 비교
                    if (order[i] == cnt) { //내가 들어갈 자리라면
                        ans[j] = i + 1;
                        break;
                    } else { //나보다 큰 사람이 들어가야 할 위치라면
                        cnt++;
                    }
                }
            }
        }

        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }

    }
}

