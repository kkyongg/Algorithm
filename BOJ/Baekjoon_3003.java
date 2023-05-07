package BOJ;

import java.util.Arrays;
import java.util.Scanner;

public class Baekjoon_3003 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numArr = new int[6];
        int[] black = {1, 1, 2, 2, 2, 8}; //찾아야 하는 개수
        int[] result = new int[6];

        for (int i = 0; i < 6; i++) {
            numArr[i] = Integer.parseInt(scanner.next());

            if (numArr[i] == black[i]) { //알맞게 다 찾은 경우
                result[i] = 0;
            } else { //찾은 개수가 부족하거나 많은 경우
                int n = numArr[i] - black[i];
                if (n < 0) { //찾은 개수가 부족할 때
                    result[i] = Math.abs(n); //음수를 양수로 변환
                } else { //찾은 개수가 많을 때
                    result[i] = n * -1;
                }
            }
        }
        String str = Arrays.toString(result).replace("[", "").replace("]","").replace(",","");
        System.out.println(str);
    }
}
