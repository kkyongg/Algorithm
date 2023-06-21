package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main_9536_여우는어떻게울지 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(br.readLine());

        List<String> list;
        StringTokenizer st;
        for (int t = 0; t < testCase; t++) {
            st = new StringTokenizer(br.readLine());
            list = new ArrayList<>();

            while (st.hasMoreTokens()) { //울음소리 입력받기
                String sound = st.nextToken();
                list.add(sound);
            }

            Map<String, String> map = new HashMap<>(); //각 동물 울음소리 map에 저장
            for (int i = 0; i < 100; i++) {
                st = new StringTokenizer(br.readLine());
                String animal = st.nextToken();
                if (animal.equals("what")) {
                    break;
                } else {
                    String goes = st.nextToken();
                    String sound = st.nextToken();
                    map.put(animal, sound);
                }
            }

            for (int i = 0; i < list.size(); i++) {
                if (!map.containsValue(list.get(i))) {
                    System.out.print(list.get(i) + " ");
                }
            }
        }
    }
}