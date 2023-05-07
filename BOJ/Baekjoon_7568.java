package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Baekjoon_7568 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.parseInt(bufferedReader.readLine());

        StringTokenizer stringTokenizer;
        StringBuilder stringBuilder = new StringBuilder();
        int[][] arr = new int[input][2];
        int[] rankArr = new int[input];

        int rank = 0;
        for (int i = 0; i < input+1; i++) {
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            arr[i][0] = Integer.parseInt(stringTokenizer.nextToken());
            arr[i][1] = Integer.parseInt(stringTokenizer.nextToken());

            if (arr[i][0] > arr[i + 1][0]) {
                if (arr[i][1] > arr[i + 1][1]) {
                    rankArr[i + 1]++;
                }
            } else {
                if (arr[i][1] < arr[i + 1][1]) {
                    rankArr[i]++;
                }
            }
            stringBuilder.append(rankArr[i]);
        }
        System.out.println(stringBuilder);

            //첫번째 숫자 오름차순
        /*
        Arrays.sort(arr, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0] - o2[0];
            }
        });

        System.out.println(Arrays.deepToString(arr));


         */





    }
}
