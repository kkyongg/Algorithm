package Programmers;

import java.util.ArrayList;
import java.util.List;

public class Programmers_크기가작은부분문자열 {
    public static void main(String[] args) {

        System.out.println(solution("3141592", "271"));
        System.out.println(solution("500220839878", "7"));
        System.out.println(solution("10203", "15"));

    }

    public static int solution(String t, String p) {
        List<Long> list = new ArrayList<>();

        for (int i = 0; i < t.length(); i++) {
            if (i < t.length() - p.length() + 1) {
                String checkNum = t.substring(i, i + p.length());
                list.add(Long.valueOf(checkNum));
            }
        }

        int count = 0;
        for (int l = 0; l < list.size(); l++) {
            if (list.get(l) <= Long.parseLong(p)) {
                count++;
            }
        }

        return count;
    }
}
