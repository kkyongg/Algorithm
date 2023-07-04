package Programmers;

public class Programmers_핸드폰번호가리기 {
    public static void main(String[] args) {

        System.out.println(solution("01022223333"));
        System.out.println(solution("021234567"));

    }

    public static StringBuilder solution(String phone_number) {

        int length = phone_number.length();
        String lastNumber = phone_number.substring(length - 4, length);

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < length - 4; i++) {
            sb.append("*");
        }

        sb.append(lastNumber);

        return sb;
    }
}