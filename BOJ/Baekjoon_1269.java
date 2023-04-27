package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Baekjoon_1269 {  //대칭 차집합
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        int elementA = Integer.parseInt(stringTokenizer.nextToken());
        int elementB = Integer.parseInt(stringTokenizer.nextToken());

        Set<Integer> setA = new HashSet<>();
        Set<Integer> copyA = new HashSet<>();

        stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        for (int i = 0; i < elementA; i++) {
            int num = Integer.parseInt(stringTokenizer.nextToken());
            setA.add(num);
            copyA.add(num);
        }

        Set<Integer> setB = new HashSet<>();
        stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        for (int i = 0; i < elementB; i++) {
            setB.add(Integer.parseInt(stringTokenizer.nextToken()));
        }

        setA.addAll(setB); //합집합
        copyA.retainAll(setB); //교집합

        System.out.println(setA.size() - copyA.size());
        bufferedReader.close();
    }
}
