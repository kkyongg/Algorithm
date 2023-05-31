package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;

public class Main_2870_수학숙제 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.parseInt(br.readLine());

        //각 줄은 최대 100글자, 숫자 100자리 가능 -> BigInteger 사용해야함
        List<BigInteger> list = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < input; i++) {

            String str = br.readLine();
            String[] num = str.split("[a-z]");

            for (int j = 0; j < num.length; j++) {
                if (!num[j].equals("")) {
                    list.add(new BigInteger(num[j]));
                }
            }

            Collections.sort(list);
        }

        for (BigInteger integer : list) {
            sb.append(integer).append("\n");
        }

        System.out.println(sb);
    }
}
