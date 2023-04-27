package baekjoon;

import java.util.Scanner;

public class Baekjoon_2588 {

    public static void main(String[] args) {

        // 입력받을 두개의 변수 생성
        Scanner in = new Scanner(System.in);

        // ex) num1 = 472, num2 = 385
        int num1 = in.nextInt();
        int num2 = in.nextInt();

        //한자리씩 곱셉을 위해 세자리 수를 각각 배열로 저장해서 첫번째 입력받은 세자리수와 곱해줌
        String str2 = Integer.toString(num2);

        int[] arrNum2 = new int[str2.length()];
        for (int i = 0; i < str2.length(); i++) {
            arrNum2[i] = str2.charAt(i) - '0';
        }
        //System.out.println(Arrays.toString(arrNum2)); 결과 : [3, 8, 5]

        int result1 = num1 * arrNum2[2]; //472 * 5
        int result2 = num1 * arrNum2[1]; //472 * 8
        int result3 = num1 * arrNum2[0]; //472 * 3

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(num1 * num2);

    }
}
