package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon_5622 {
    public static void main(String[] args) throws IOException {
        //0-9 10개
        //abc, def, ghi, jkl, mno, pqrs, tuv, wxyz

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String num = bufferedReader.readLine();
        int sum = 0;

        for (int j = 0; j < num.length(); j++) {
            char a = num.charAt(j);

            if (String.valueOf(a).equals("A") || String.valueOf(a).equals("B") || String.valueOf(a).equals("C")) {
                sum += 3;

            }
            if (String.valueOf(a).equals("D") || String.valueOf(a).equals("E") || String.valueOf(a).equals("F")) {
                sum += 4;

            }
            if (String.valueOf(a).equals("G") || String.valueOf(a).equals("H") || String.valueOf(a).equals("I")) {
                sum += 5;

            }
            if (String.valueOf(a).equals("J") || String.valueOf(a).equals("K") || String.valueOf(a).equals("L") ){
                sum += 6;

            }
            if (String.valueOf(a).equals("M") || String.valueOf(a).equals("N") || String.valueOf(a).equals("O")) {
                sum+= 7;

            }
            if (String.valueOf(a).equals("P") || String.valueOf(a).equals("Q") || String.valueOf(a).equals("R") || String.valueOf(a).equals("S")) {
                sum += 8;

            }
            if (String.valueOf(a).equals("T") || String.valueOf(a).equals("U") || String.valueOf(a).equals("V")) {
                sum += 9;

            }
            if (String.valueOf(a).equals("W") || String.valueOf(a).equals("X") || String.valueOf(a).equals("Y") || String.valueOf(a).equals("Z")) {
                sum += 10;

            }

        }
        System.out.println(sum);
        bufferedReader.close();
    }
}

/*
1. 아스키 코드
 for (int j = 0; j < num.length(); j++) {
            char a = num.charAt(j);

            if ((int) a < 68) {
                sum = sum + 3;
            } else if ((int) a < 71) {
                sum = sum + 4;

            } else if ((int) a < 74) {
                sum = sum + 5;

            } else if ((int) a < 77) {
                sum = sum + 6;

            } else if ((int) a < 80) {
                sum = sum + 7;

            } else if ((int) a < 84) {
                sum = sum + 8;

            } else if ((int) a < 87) {
                sum = sum + 9;
            }

            --> 왜 틀렸지?

 2. switch ~ case 문

            switch(a) {
			case 'A' : case 'B': case 'C' :
			    sum += 3;
				break;

 */