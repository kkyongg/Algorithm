package BOJ;

import java.util.Scanner;

//주사위 세개
public class Baekjoon_2480 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //3개의 눈이 빈칸을 사이에 두고 각각 주어짐
        int[] arr = new int[3];

        for (int i = 0; i < 3; i++) {
            String result = scanner.next();
            arr[i] = Integer.parseInt(result);
        }
        //같은 눈 3개 : 10,000원+(같은 눈)×1,000원
        if (arr[0] == arr[1] && arr[1] == arr[2]) {
            int sum = 10000 + (arr[0] * 1000);
            System.out.println(sum);
        }
        //같은 눈 2개 : 1,000원+(같은 눈)×100원
        if (arr[0] == arr[1] && arr[0] != arr[2]) {
            int sum = 1000 + (arr[0] * 100);
            System.out.println(sum);
        }
        if (arr[1] == arr[2] && arr[0] != arr[2]) {
            int sum = 1000 + (arr[1] * 100);
            System.out.println(sum);

        }
        if (arr[0] == arr[2] && arr[0] != arr[1]) {
            int sum = 1000 + (arr[0] * 100);
            System.out.println(sum);

        }

        //모두 다른 눈이 나온 경우 : (그 중 가장 큰 눈)×100원
        if (arr[0] != arr[1] && arr[1] != arr[2] && arr[0] != arr[2]) {
            int max = Math.max(arr[0], arr[1]);
            int max1 = Math.max(max, arr[2]);
            int sum = max1 * 100;
            System.out.println(sum);
        }

    }
}
