package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon_1157 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String word = bufferedReader.readLine().toUpperCase();
        int[] alphabet = new int[26];

        //단어 읽기 - 한글자씩
        for (int i = 0; i < word.length(); i++) {
            int alphabetCode = word.charAt(i) - 'A';
            alphabet[alphabetCode]++; //해당하는 알파벳 배열 위치에 ++

        }

        int max = -1; //초기값 0이라서 -1로 생성
        char result = ' '; //출력할 문자

        //배열에서 최댓값 찾기
        for (int i = 0; i < alphabet.length; i++) {
            if (alphabet[i] > max) {
                max = alphabet[i];
                result = (char) (i + 'A'); //해당 알파벳을 알아내기 위해 +'A'
            } else if (alphabet[i] == max) {
                result = '?';
            }
        }
        System.out.println(result);
    }
}
