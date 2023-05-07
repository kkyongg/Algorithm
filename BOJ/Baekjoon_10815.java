package BOJ;

import java.io.*;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Baekjoon_10815 {
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(bufferedReader.readLine()); //상근이 숫자 카드 개수
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        HashSet<Integer> set1 = new HashSet<>();

        for (int i = 0; i < n; i++) { //상근이 숫자카드 n개를 set 에 넣기
            int yourNumber = Integer.parseInt(stringTokenizer.nextToken());
            set1.add(yourNumber);
        }

        int m = Integer.parseInt(bufferedReader.readLine());
        stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        for (int i = 0; i < m; i++) { //비교할 내 카드 m개를 set 에 있는 숫자 하나하나와 비교
            int myNumber = Integer.parseInt(stringTokenizer.nextToken());
            if (set1.contains(myNumber)) {
                bufferedWriter.write("1");
            } else {
                bufferedWriter.write("0");
            }
            bufferedWriter.write(" ");
        }

        bufferedWriter.close();
    }
}
