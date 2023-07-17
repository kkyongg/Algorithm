package Programmers;

public class Programmers_두정수사이의합 {
    public static void main(String[] args) {

        System.out.println(solution(3, 5));
        System.out.println(solution(3, 3));
        System.out.println(solution(5, 3));

    }

    public static long solution(int a, int b) {
        long answer = 0;

        if (a == b) return a;

        if (a < b) {
            for (int i = a; i <= b; i++) {
                answer += i;
            }

        } else {
            for (int i = a; i >= b; i--) {
                answer += i;
            }
        }

        return answer;
    }
}

