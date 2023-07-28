package Programmers;

public class Programmers_부족한금액계산하기 {
    public static void main(String[] args) {
        System.out.println(solution(3, 20, 4));
    }

    public static long solution(int price, int money, int count) {

        long total = 0;
        for (int i = 0; i < count; i++) {
            //n배 카운트
            total += (long) price * (i + 1);
        }

        long answer = total - money;

        if (answer < 0) {
            return 0;
        }

        return answer;
    }

}
