package BOJ;

import java.io.*;

public class Baekjoon_15552 {
    public static void main(String[] args) throws IOException {

        //Scanner 와 System.out.println 대신
        //BufferedReader 와 BufferedWriter 를 사용

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader((System.in)));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        int testCase = Integer.parseInt(bufferedReader.readLine());

        String result;
        for (int i = 0; i < testCase; i++) {

            //두 수를 입력을 공백으로 구분하기
            String[] input = bufferedReader.readLine().split(" ");
            int n1 = Integer.parseInt(input[0]);
            int n2 = Integer.parseInt(input[1]);
            result = String.valueOf(n1 + n2);

            bufferedWriter.write(result);
            bufferedWriter.newLine();
        }
        bufferedWriter.flush();
    }
}
