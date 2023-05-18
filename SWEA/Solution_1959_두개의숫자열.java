package SWEA;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_1959_두개의숫자열 {

    public static int sum;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        StringTokenizer st;
        for (int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine());
            int n1 = Integer.parseInt(st.nextToken());
            int n2 = Integer.parseInt(st.nextToken());

            int[] arr1 = new int[n1];
            int[] arr2 = new int[n2];

            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n1; j++) {
                int input = Integer.parseInt(st.nextToken());
                arr1[j] = input;
            }

            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n2; j++) {
                int input = Integer.parseInt(st.nextToken());
                arr2[j] = input;
            }

            if (arr1.length > arr2.length) {
                compareArr(arr1, arr2);
            } else {
                compareArr(arr2, arr1);
            }

            System.out.println("#" + (i + 1) + " " + sum);

        }
    }

    /**
     * @param arr1 크기가 큰 배열
     * @param arr2 크기가 작은 배열
     */
    public static void compareArr(int[] arr1, int[] arr2) {

        //배열 크기 비교
        int temp = 0;

        int repeat = arr1.length - arr2.length + 1;

        for (int i = 0; i < repeat; i++) { //확인할 횟수
            sum = 0;
            for (int j = 0; j < arr2.length; j++) {
                //ex) arr1.length = 5, arr2.length = 3일 때
                //arr2[j] 는 계속 고정 0,1,2 이고, arr1[]은 0,1,2 -> 1,2,3 -> 2,3,4 순으로 커져야 하니까 arr1[i+j]임 ;;
                sum += arr1[i + j] * arr2[j];
            }

            if (temp > sum) {
            } else {
                temp = sum;
            }
        }
        if(temp > sum) sum = temp;
    }
}
