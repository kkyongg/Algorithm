package Programmers;

public class Programmers_이상한문자만들기 {
    public static void main(String[] args) {

        StringBuilder sb;
        System.out.println(Solution("try hello world")); //"TrY HeLlO WoRlD"
        System.out.println(Solution("  TRy HElLo  WORLD ")); //"  TrY HeLlO  WoRlD "
    }

    public static StringBuilder Solution(String s) {

        StringBuilder sb = new StringBuilder();
        //공백 기준으로 나눠서 배열에 저장
        String[] words = s.split("");

        boolean result = true;
        int count = 0;
        for (int i = 0; i < words.length; i++) { //배열 안 단어 수만큼 반복

            if (!result) { //false 일 때
                count = 0;
            }
            if (words[i].equals(" ")) {
                result = false;
            } else { //공백이 아닌 단어일 경우
                result = true;
                if (count == 0) {
                    words[i] = words[i].toUpperCase();
                    count++;
                } else if (count % 2 == 0) {
                    words[i] = words[i].toUpperCase();
                    count++;
                } else {
                    words[i] = words[i].toLowerCase();
                    count++;
                }
            }
        }

        for (int i = 0; i < words.length; i++) {
            sb.append(words[i]);
        }

        return sb;
    }
}


