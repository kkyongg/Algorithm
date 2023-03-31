package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Baekjoon_11651 {
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(bufferedReader.readLine());

        int[][] xNy = new int[testCase][2];

        for (int i = 0; i < testCase; i++) {
            StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());

            for (int j = 0; j < 2; j++) {
                xNy[i][j] = Integer.parseInt(stringTokenizer.nextToken());
            }
        }

        Arrays.sort(xNy, (o1, o2) -> {
            if (o1[1] == o2[1]) {
                return Integer.compare(o1[0], o2[0]);
            } else {
                return Integer.compare(o1[1], o2[1]);
            }
        });

        for (int i = 0; i < testCase; i++) {
            System.out.println(xNy[i][0] + " " + xNy[i][1]);
        }
        //시간초과
        /*
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int testCase = Integer.parseInt(bufferedReader.readLine());

        int[][] xNy = new int[testCase][2];

        for (int i = 0; i < testCase; i++) {
            StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());

            for (int j = 0; j < 2; j++) {
                xNy[i][j] = Integer.parseInt(stringTokenizer.nextToken());
            }
        }

        int tmp;
        int same;
        for (int i = 0; i < xNy.length; i++) {
            for (int j = i + 1; j < xNy.length; j++) {
                if (xNy[j][1] > xNy[i][1]) {
                    tmp = xNy[j][1];
                    xNy[j][1] = xNy[i][1];
                    xNy[i][1] = tmp;
                } else if (xNy[j][1] == xNy[i][1]) {
                    if (xNy[j][0] > xNy[i][0]) {
                        same = xNy[j][1];
                        xNy[j][1] = xNy[i][1];
                        xNy[i][1] = same;
                    }
                }
            }
        }

        for (int i = 0; i < xNy.length; i++) {
            for (int j = 0; j < xNy.length; j++) {
                String element = String.valueOf(xNy[i][j]);
                String result = element.replace("[", "").replace(",", "").replace("]", "");

                System.out.print(result);
                System.out.print(" ");
            }
            System.out.println();
        }


         */
    }
}
