package Programmers;

import java.util.Arrays;

public class Programmers_전화번호목록 {
    public static void main(String[] args) {

        String[] pb1 = {"119", "97674223", "1195524421"};
        String[] pb2 = {"123", "456", "789"};
        String[] pb3 = {"12", "123", "1235", "567", "88"};
        String[] pb4 = {"12", "88", "27", "889", "32"};

        System.out.println(solution(pb1));
        System.out.println(solution(pb2));
        System.out.println(solution(pb3));
        System.out.println(solution(pb4));

    }

    public static boolean solution(String[] phone_book) {
        boolean answer = true;

        Arrays.sort(phone_book);

        for (int i = 0; i < phone_book.length - 1; i++) {

            if (phone_book[i + 1].startsWith(phone_book[i])) {
                answer = false;
                break;
            }
        }

        return answer;

    }
}
