package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main_2493_탑 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine()); //탑 갯수

        Stack<int[]> stack = new Stack<>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder result = new StringBuilder();

        for (int i = 1; i <= n; i++) {
            int height = Integer.parseInt(st.nextToken());

            while (!stack.isEmpty()) {
                int[] top = stack.peek(); //[위치, 높이]
                if (top[1] > height) {
                    result.append(top[0]).append(" ");
                    break;
                } else {
                    stack.pop();
                }
            }

            if (stack.isEmpty()) result.append("0").append(" ");
            stack.push(new int[]{i, height}); //[위치, 높이]
        }
        System.out.println(result);
    }
}