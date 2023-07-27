package BOJ;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main_1316_그룹단어체커 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(br.readLine());
        int count;
        int answer = 0;

        for (int i = 0; i < testCase; i++) {
            Map<Character, Integer> map = new HashMap<>();
            String str = br.readLine();
            count = 0;

            if (str.length() > 1) {
                for (int j = 1; j < str.length(); j++) {

                    char beforeWord = str.charAt(j - 1);
                    char word = str.charAt(j);

                    if (beforeWord == word) {
                        if (!map.containsKey(word)) {
                            map.put(word, 0);
                        }

                    } else {
                        if (!map.containsKey(beforeWord)) {
                            map.put(beforeWord, 0);
                        }
                        if (map.containsKey(word)) {
                            count = 0;
                            break;
                        }
                    }
                    count++;

                }
            } else if (str.length() == 1) {
                count++;
            }

            if (count > 0) {
                answer++;
            }
        }
        System.out.println(answer);
    }
}

