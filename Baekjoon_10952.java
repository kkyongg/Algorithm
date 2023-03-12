package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Scanner;


public class Baekjoon_10952 { //1번 풀이
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        while (true) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();

            if (a == 0 && b == 0) { //입력 0 0이면 종료
                scanner.close();
                break;
            }
            System.out.println(a + b);
        }
    }
}

/*
public class Baekjoon_10952 { //2번 풀이
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        //https://hardlearner.tistory.com/288

        while(true) {
            //BufferedReader 로 입력 받으면 공백까지 인식
            //문자열 쪼개는 법 split(), StringTokenizer
            st = new StringTokenizer(br.readLine()," ");
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());

            if(A==0 && B==0) {
                break;
            }
            sb.append((A+B)).append('\n');
        }
        System.out.println(sb);
    }
}


 */