package baekjoon;

import java.util.ArrayList;
import java.util.Scanner;

public class Baekjoon_10773 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCase = scanner.nextInt();

        ArrayList<Integer> arrList = new ArrayList<>();
        int sum = 0;

        for (int i = 0; i < testCase; i++) {
            int num = scanner.nextInt();

            //입력 숫자가 0이면 list 의 마지막 값 삭제
            if (num == 0) {
                arrList.remove(arrList.size() - 1);
            } else {
                arrList.add(num);
            }

        }
        //list 모든 값 더하기
        for (int j = 0; j < arrList.size(); j++) {
            sum += arrList.get(j);
        }
        System.out.println(sum);
    }


}

