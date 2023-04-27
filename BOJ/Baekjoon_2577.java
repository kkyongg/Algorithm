package baekjoon;

import java.util.Scanner;

public class Baekjoon_2577 {
    public static void main(String[] args) {
        // 세자리수인 두 수를 곱해서 나온 결과에 0-9까지의 숫자가 각각 몇개씩 있는지 구하기

        Scanner scanner = new Scanner(System.in);
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        int n3 = scanner.nextInt();
        int result = n1 * n2 * n3;

        int length = (int) (Math.log10(result) + 1); //int 자리수 구하는 방법 -> result 의 자리수 구하기
        int[] resultArr = new int[length]; //자리수만큼 배열 생성

        for (int i = 1; i < length + 1; i++) {

            //int 자리수 만큼 반복하며 각 자리수의 수를 배열에 저장
            //result 가 44,253,432 일 때 1의 자리 부터 10000000의 자리인 2,3,4,3,5,2,4,4 가 배열에 저장
            double r = Math.pow(10, i); //제곱수 구하기
            double r1 = Math.pow(10, i - 1);
            int n = (int) (result % r / r1);
            resultArr[i - 1] = n;//세 수를 곱한 결과값을 1자리씩 각각 배열에 넣기

        }

        //0부터 9까지 숫자가 몇 개씩 있는지 확인
        int cnt = 0; //카운트 되는 횟수

        for (int k = 0; k < 10; k++) {
            cnt = 0; //0부터 9까지 확인할 때 마다 0으로 리셋
            for (int j = 0; j < length; j++) {
                if (resultArr[j] == k) { //배열 첫번째 요소부터 마지막 요소까지 0~9가 몇개씩 있는지 확인
                    cnt++; //0~9까지 해당되는 수가 있으면 +1씩 카운트 됨
                }
            }
            System.out.println(cnt);
        }

    }
}
