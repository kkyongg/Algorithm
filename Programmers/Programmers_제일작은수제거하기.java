package Programmers;

import java.util.Arrays;

public class Programmers_제일작은수제거하기 {
    public static void main(String[] args) {

        System.out.println(Arrays.toString(solution(new int[]{4, 3, 2, 1})));
        System.out.println(Arrays.toString(solution(new int[]{10})));
        System.out.println(Arrays.toString(solution(new int[]{3, 6, 4, 1, 2})));

    }

    public static int[] solution(int[] arr){
        int min = arr[0];
        if(arr.length == 1) {
            int[] answer = {-1};
            return answer;
        }

        //최솟값 뺀 배열크기로 생성
        int[] answer = new int[arr.length-1];
        int index = 0;

        //최솟값 찾기
        for (int i = 1; i < arr.length; i++) {
            if(min > arr[i]) {
                min= arr[i];
                index = i; //최솟값인 인덱스 위치
            }
        }

        int answer_count = 0;
        for (int i = 0; i < arr.length; i++) {
            if(index != i) { //최솟값이 아니라면 answer 배열에 넣기
                answer[answer_count++] = arr[i];
            }
        }

        return answer;
    }
}

