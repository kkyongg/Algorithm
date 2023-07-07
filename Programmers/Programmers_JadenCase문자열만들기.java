package Programmers;

public class Programmers_JadenCase문자열만들기 {
    public static void main(String[] args) {

        System.out.println(solution("3people unFollowed me"));
        System.out.println(solution("for the last week"));

    }

    public static StringBuilder solution(String s) {
        StringBuilder sb = new StringBuilder();

        String[] words = s.split("");
        boolean checkFirst = true;

        for (int i = 0; i < words.length; i++) {
            //만약 공백이라면
            if (words[i].equals(" ")) {
                sb.append(words[i]);
                checkFirst = true;

            } else {
                //공백 다음 첫번째 글자라면
                if (checkFirst) {
                    sb.append(words[i].toUpperCase());
                    checkFirst = false;
                    //첫번째 글자가 아니라면
                } else {
                    sb.append(words[i].toLowerCase());
                }

            }
        }

        return sb;
    }
}
