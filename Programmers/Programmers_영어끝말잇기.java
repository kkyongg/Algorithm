package Programmers;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Programmers_영어끝말잇기 {
    public static void main(String[] args) {

        System.out.println(Arrays.toString(solution(3, new String[]{"tank", "kick", "know", "wheel", "land", "dream", "mother", "robot", "tank"})));
        System.out.println(Arrays.toString(solution(5, new String[]{"hello", "observe", "effect", "take", "either", "recognize", "encourage", "ensure", "establish", "hang", "gather", "refer", "reference", "estimate", "executive"})));
        System.out.println(Arrays.toString(solution(2, new String[]{"hello", "one", "even", "never", "now", "world", "draw"})));

    }

    public static int[] solution(int n, String[] words) {
        int[] answer = new int[2];

        Map<String, Integer> checkWord = new HashMap<>(); //단어 중복 여부 판단
        checkWord.put(words[0], 0); //첫번째 단어 map에 저장

        int person = 0;
        int turn = 1;
        char alphabet = words[0].charAt(words[0].length() - 1); //첫번째 단어의 맨 마지막 알파벳

        for (int i = 0; i < words.length; i++) {

            person++;

            if (words[i].length() == 1) {
                // 단어가 한글자라면
                answer[0] = person;
                answer[1] = turn;
                break;

            }

            if (i > 0) {

                if (alphabet == words[i].charAt(0)) { //앞 사람 마지막 알파벳과 현재 단어 첫번째 알파벳 같으면 끝말잇기 계속
                    alphabet = words[i].charAt(words[i].length() - 1); //다음 단어와 비교하기 위해 현재 단어의 마지막 알파벳 저장

                    if (checkWord.containsKey(words[i])) { //이미 단어가 있다면
                        answer[0] = person;
                        answer[1] = turn;
                        break;

                    } else { //없다면
                        checkWord.put(words[i], 0); //단어 map에 저장

                    }

                } else { //알파벳 다르면
                    answer[0] = person;
                    answer[1] = turn;
                    break;
                }
            }

            if (person == n) { //n번 사람까지 했으면 다시 1번 사람으로 돌아가야함 & 턴 수 +1
                person = 0;
                turn++;
            }

        }
        return answer;
    }
}
