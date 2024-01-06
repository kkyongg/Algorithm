package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Main_11478_서로다른부분문자열의개수 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        Set<String> set = new HashSet<>();

        //1번 풀이
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j <= str.length(); j++) {
                set.add(str.substring(i, j));
            }
        }

        //2번 풀이
        int count = 0;
        int split = 1;
        while (count != str.length()) {
            for (int i = 0; i < str.length(); i++) {
                if (i + split == str.length() + 1) {
                    break;
                } else {
                    set.add(str.substring(i, i + split));
                }
            }
            split++;
            count++;
        }

        System.out.println(set.size());
    }
}

