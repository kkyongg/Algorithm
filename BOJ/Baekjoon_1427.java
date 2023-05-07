package BOJ;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Baekjoon_1427 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        char[] num = sc.nextLine().toCharArray(); //char 배열로 숫자 입력받음
        int[] result = new int[num.length]; //같은 크기로 int 배열 생성

        for (int i = 0; i < num.length; i++) {
            result[i] = num[i] - '0'; //char -> int
        }

        //내림차순 정렬
        Integer[] arr2 = Arrays.stream(result).boxed().toArray(Integer[]::new);
        Arrays.sort(arr2, Collections.reverseOrder());

        //배열 -> int 형으로
        int numResult = Integer.parseInt(Arrays.toString(arr2).replaceAll("[^0-9]", ""));

        System.out.println(numResult);

    }

}
