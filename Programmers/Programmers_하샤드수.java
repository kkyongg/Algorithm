package Programmers;

public class Programmers_하샤드수 {
    public static void main(String[] args) {

        System.out.println(solution(10));
        System.out.println(solution(11));
        System.out.println(solution(12));
        System.out.println(solution(13));
    }

    public static boolean solution(int x) {

        //string 변환 후 각 자리수 배열에 넣기
        String num = String.valueOf(x);
        String[] eachNum = num.split("");

        int sum = 0;
        for (int i = 0; i < eachNum.length; i++) {
            //각 자리수 더하기
            sum = sum + Integer.parseInt(eachNum[i]);
        }

        boolean answer = true;
        if (x % sum != 0) {
            answer = false;
        }

        return answer;
    }
}
