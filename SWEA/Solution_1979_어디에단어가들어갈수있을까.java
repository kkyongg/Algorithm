package SWEA;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_1979_어디에단어가들어갈수있을까 {
    public static int count;
    public static int wordLength;
    public static int length;

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int testCase = Integer.parseInt(bufferedReader.readLine());

        StringTokenizer st;
        for (int i = 0; i < testCase; i++) { //테스트 수
            st = new StringTokenizer(bufferedReader.readLine());
            length = Integer.parseInt(st.nextToken()); //한 변의 길이
            wordLength = Integer.parseInt(st.nextToken()); //단어 길이
            count = 0;

            int[][] square = new int[length][length];

            //0 또는 1 입력
            for (int j = 0; j < length; j++) {
                st = new StringTokenizer(bufferedReader.readLine());
                for (int k = 0; k < length; k++) {
                    int _0or1 = Integer.parseInt(st.nextToken());
                    square[j][k] = _0or1;
                }
                //열 체크
                checkRow(square[j]);
            }
            //행 체크
            checkColumn(square);
            System.out.println("#" + (i + 1) + " " + count);
        }
    }

    public static void checkRow(int[] arr) {
        //count 로 결과값 체크
        int last = 0;
        int space = 0;

        for (int i = 0; i < length; i++) {
            if (arr[i] == 0) {
                if (last == 0) {
                    continue;
                } else {
                    if (space == wordLength) { //이미 단어 길이가 충족됐고 그 다음이 0일 때 count +1 해야함
                        count++;
                    }
                    //0이니까 last, space 모두 초기화
                    last = 0;
                    space = 0;
                }
            } else if (arr[i] == 1) {
                last = 1;
                space++;
            }
        }
        //마지막에 단어길이가 충족됐으면 count +1
        if (space == wordLength) {
            count++;
        }
    }

    public static void checkColumn(int[][] arr) {
        //count 로 결과값 체크
        //행 체크
        int last = 0;
        int space;
        for (int i = 0; i < length; i++) {
            space = 0;
            for (int j = 0; j < length; j++) {
                if (arr[j][i] == 0) {
                    if (last == 0) {
                        continue;
                    } else {
                        if (space == wordLength) { //이미 단어 길이가 충족됐고 그 다음이 0일 때 count +1 해야함
                            count++;
                        }
                        //0이니까 last, space 모두 초기화
                        last = 0;
                        space = 0;
                    }
                } else if (arr[j][i] == 1) {
                    space++;
                    last = 1;
                }
            }
            //마지막에 단어길이가 충족됐으면 count +1
            if (space == wordLength) {
                count++;
            }
        }
    }
}
