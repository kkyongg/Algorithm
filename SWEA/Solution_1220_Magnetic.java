package SWEA;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Solution_1220_Magnetic {
    public static void main(String[] args) throws IOException {
        //1은 n극(아래로 이동), 2는 s극(위로 이동)

        int[][] arr = new int[100][100];
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        for (int k = 0; k < 10; k++) {

            int length = Integer.parseInt(br.readLine()); //항상 100
            //100 * 100 채우기
            for (int i = 0; i < length; i++) {
                st = new StringTokenizer(br.readLine());
                for (int j = 0; j < length; j++) {
                    arr[i][j] = Integer.parseInt(st.nextToken());
                }
            }

            //교착상태 갯수
            int count = 0;

            //확인해야할 1,2만 list에 삽입
            for (int i = 0; i < length; i++) {
                List<Integer> list = new ArrayList<>();
                for (int j = 0; j < length; j++) {
                    if (arr[j][i] != 0) {
                        list.add(arr[j][i]);
                    }
                }

                int last = -1;
                for (int l = 0; l < list.size(); l++) {

                    //첫번째가 2면 위로 이동하니까 안봐도됨
                    //1일때만 밑에 요소를 봐야함
                    //1 -> 2 만나고 또 2가 오면 x : 그 2는 위로 이동하고 있는거니까 이미 앞에 2가 교착상태가 됨. 다음 1과 상관 없음
                    if (list.get(l) == 1) {
                        last = 1;
                    }

                    if (last == 1 && list.get(l) == 2) {
                        count++;
                        last = 0;
                    }
                }
            }
            System.out.println("#" + (k + 1) + " " + count);
        }
    }
}
