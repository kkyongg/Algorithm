package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main_1439_뒤집기 { //같은 수로 만들기 위해 뒤집을 최소 횟수
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //110001101001 일 때

        //첫번째 방법 : 중복된 숫자를 한번씩만 카운트
        String[] input = br.readLine().split("");

        int oneCount = 0, zeroCount = 0;
        boolean zeroCheck = false;
        boolean oneCheck = false;

        //110001101001 -> 1,0,1,0,1,0,1
        for (int i = 0; i < input.length; i++) {
            if (!zeroCheck && Objects.equals(input[i], "1")) {
                oneCount++;
                zeroCheck = true;
                oneCheck = false;
            } else if (!oneCheck && Objects.equals(input[i], "0")) {
                zeroCount++;
                oneCheck = true;
                zeroCheck = false;
            }
        }
        //1,0,1,0,1,0,1 -> 같은 수를 만들기 위해 0은 3번, 1은 4번 뒤집어야함
        System.out.println(Math.min(zeroCount, oneCount));

        //두번째 방법 : StringTokenizer 이용
        String inputStr = br.readLine();
        StringTokenizer oneCount1 = new StringTokenizer(inputStr, "0"); //0을 기준으로 자르기
        StringTokenizer zeroCount1 = new StringTokenizer(inputStr, "1"); //1을 기준으로 자르기
        //oneCount1.countTokens()) : 1,1,1,1 -> 4
        //zeroCount1.countTokens() : 0,0,0 -> 3
        System.out.println(Math.min(oneCount1.countTokens(), zeroCount1.countTokens()));


        //세번째 방법 : 앞 인덱스와 값이 다른 경우 카운트
        String[] arr = br.readLine().split("");

        int oneCount2 = 0, zeroCount2 = 0;
        //첫번째 인덱스 확인
        if (arr[0].equals("0")) zeroCount2++;
        else oneCount2++;

        for (int i = 1; i < arr.length; i++) {
            if (!arr[i - 1].equals(arr[i])) { //앞 인덱스와 비교
                if (arr[i].equals("0")) zeroCount2++;
                else oneCount2++;
            }
        }

        System.out.println(Math.min(zeroCount2, oneCount2));
    }
}
