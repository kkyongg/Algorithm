package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Baekjoon_2501 {
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer str = new StringTokenizer(bufferedReader.readLine());
        int[] numArr = new int[2];

        for (int i = 0; i < 2; i++) {
            int num = Integer.parseInt(str.nextToken());
            numArr[i] = num;
        }

        Set<Integer> set = new HashSet<>();
        for (int i = 1; i < numArr[0] + 1; i++) {
            //자연수 p를 자연수 q로 나누었을 때 나머지가 0이면 q는 p의 약수
            int div = numArr[0] % i; //나머지
            int mod = numArr[0] / i; //몫
            if (div == 0) {
                set.add(mod); //약수 set 에 add
            }
        }

        ArrayList<Integer> list = new ArrayList<>(set);
        Collections.sort(list); //오름차순 정렬

        if (set.size() < numArr[1]) { //만약 약수의 개수가 입력한 수보다 적어서 존재하지 않을 경우 0출력
            System.out.println(0);
        } else {
            System.out.println(list.get(numArr[1] - 1));
        }

    }
}
