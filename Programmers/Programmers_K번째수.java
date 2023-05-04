package baekjoon.Programmers;

import java.util.Arrays;

public class Programmers_K번째수 {
    public static void main(String[] args) {
        int[] array = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
        int[] result = Solution(array, commands);

        System.out.println(Arrays.toString(result));
    }

    public static int[] Solution(int[] array, int[][] commands) {

        int[] answer = new int[commands.length];
        for (int i = 0; i < commands.length; i++) {

            int start = commands[i][0]; //2
            int end = commands[i][1]; //5
            int num = commands[i][2]; //3

            int size = end - start + 1; //배열 크기 4

            int[] newArr = new int[size]; //int[4]

            for (int j = 0; j < size; j++) { //0~3

                if ((start - 1) != end) {
                    newArr[j] = array[start - 1];
                    start++;
                } else {
                    break;
                }
            }
            Arrays.sort(newArr);
            answer[i] = newArr[num - 1];
        }
        return answer;
    }


}
