package Programmers;

public class Programmers_가운데글자가져오기 {
    public static void main(String[] args) {

        System.out.println(solution("abcde"));
        System.out.println(solution("qwer"));

    }

    public static String solution(String s) {
        int index = s.length() / 2;

        String answer;

        if (s.length() % 2 == 1) { //홀수
            answer = Character.toString(s.charAt(index));

        } else { //짝수
            answer = String.valueOf(s.charAt(index - 1)) + s.charAt(index);
        }
        return answer;
    }
}