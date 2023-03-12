package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon_2675 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String testCase = br.readLine();

        for (int j = 0; j < Integer.parseInt(testCase); j++) { // testcase 만큼 반복
            String str = br.readLine(); //ex) 3 ABC
            String[] splitStr = str.split(" "); //공백 앞 : 반복 횟수 & 공백 뒤 : 반복할 문자 를 나눠줌
            int repeatNum = Integer.parseInt(splitStr[0]); //반복횟수 : 3
            String result = "";


                int strLength = splitStr[1].length(); //반복할 단어 길이 : ABC 면 3개
                for (int k = 0; k < strLength; k++) { //3
                    String str1 = String.valueOf(splitStr[1].charAt(k)); //3개

                    for (int n = 0; n < repeatNum; n++) { //3번씩
                        result = result + str1;
                    }
                }

            System.out.println(result);
        }
        br.close();
    }
}
