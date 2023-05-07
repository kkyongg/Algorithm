package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;


public class Baekjoon_1181 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int numberOfWord = Integer.parseInt(bufferedReader.readLine());


        String[] strArr = new String[numberOfWord];
        for (int i = 0; i < numberOfWord; i++) {
            strArr[i] = bufferedReader.readLine();
        }

        Arrays.sort(strArr, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.length() == o2.length()) { //문자열 길이 같으면
                    return o1.compareTo(o2); //사전순 정렬

                } else {
                    return o1.length() - o2.length(); //길이로 비교
                }
            }
        });

        System.out.println(strArr[0]);//0번과 1번을 비교 하기 위해
        for (int i = 1; i < strArr.length; i++) {
            if (strArr[i - 1].equals(strArr[i])) {
                continue;
            }
            System.out.println(strArr[i]);
        }
    }
}
