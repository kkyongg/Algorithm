package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_1541_잃어버린괄호 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //식 입력받기
        String str = br.readLine(); //55-50+40
        //-기준으로 나누기
        String[] numbers = str.split("-"); //[55, 50+40]

        int result = 0;
        for (int i = 0; i < numbers.length; i++) {
            //덧셈 수행
            int sum = 0;
            String[] plus = numbers[i].split("\\+"); //+있다면 +기준으로 나누기
            for (int j = 0; j < plus.length; j++) {
                sum += Integer.parseInt(plus[j]);
            }

            if (i == 0) { //식의 첫번째 숫자면 무조건 더하기
                result += sum;
            } else {
                result -= sum;
            }
        }
        System.out.println(result);
    }
}

