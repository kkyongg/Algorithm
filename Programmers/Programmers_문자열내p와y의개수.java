package Programmers;

public class Programmers_문자열내p와y의개수 {
    public static void main(String[] args) {
        boolean result = Solution("pPoooyY");
        System.out.println(result);
    }

    public static boolean Solution(String s) {
        boolean answer = true;
        int p_count = 0;
        int y_count = 0;
        for (int i = 0; i < s.length(); i++) {
            char check = s.charAt(i);
            String result = Character.toString(check);
            if (result.equals("p")) {
                p_count++;
            } else if (result.equals("y")) {
                y_count++;

            }
        }
        if (p_count == y_count) {
            answer = true;
        } else {
            answer = false;
        }
        return answer;
    }
}
