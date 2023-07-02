package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_3613 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        //에러 : str 길이 0 이거나 중간에 공백 있을 때
        if (str.length() == 0 || str.contains(" ")) {
            System.out.println("Error!");
            return;
        }

        //에러 : 첫 글자가 대문자 일 때
        char first = str.charAt(0);
        if (Character.isUpperCase(first)) {
            System.out.println("Error!");
            return;
        }

        //에러 : 맨 앞 또는 맨 뒤가 _ 일 때
        if (str.charAt(0) == '_' || str.charAt(str.length() - 1) == '_') {
            System.out.println("Error!");
            return;
        }

        //C++ 형식
        if (str.contains("_")) {
            String[] words = str.split("_");

            //에러 : _가 연속으로 나올 때
            boolean flag = true;
            for (int l = 0; l < words.length; l++) {
                if (words[l].length() == 0) {
                    System.out.println("Error!");
                    flag = false;
                    break;
                }
            }

            //에러 : C++ 형식인데 대문자 있을 경우
            boolean isContainUpper = true;
            for (int i = 1; i < str.length(); i++) {
                char ch = str.charAt(i);
                if (Character.isUpperCase(ch)) {
                    System.out.println("Error!");
                    isContainUpper = false;
                    break;
                }
            }

            if (flag && isContainUpper) {
                boolean isFirstUpper = false;
                for (int i = 0; i < words.length; i++) {

                    for (int j = 0; j < 1; j++) {
                        if (words[i].contains(" ")) {
                            System.out.println("Error!");
                            break;
                        }
                        if (i != 0) {
                            char ch = words[i].charAt(j);
                            //에러 : 언더바 다음 첫 문자가 대문자일 때
                            if (Character.isUpperCase(ch)) {
                                System.out.println("Error!");
                                isFirstUpper = true;
                                break;
                            }

                            words[i] = words[i].substring(1);
                            char change = Character.toUpperCase(ch);
                            words[i] = change + words[i];
                        }
                    }
                }
                if (!isFirstUpper) {
                    for (int i = 0; i < words.length; i++) {
                        System.out.print(words[i]);
                    }
                }
            }
        }
        //Java 형식
        else {

            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);

                if (Character.isUpperCase(ch)) { //대문자라면
                    ch = Character.toLowerCase(ch); //소문자로 변환
                    sb.append("_").append(ch); // ch 앞에 _ 추가

                } else { //소문자라면 그냥 append
                    sb.append(ch);
                }
            }
            System.out.println(sb);
        }
    }
}