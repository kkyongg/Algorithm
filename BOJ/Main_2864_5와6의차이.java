package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_2864_5와6의차이 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        String a = st.nextToken();
        String b = st.nextToken();

        int min, max;
        //최솟값이 되려면 6->5, 최댓값이 되려면 5->6
        min = Integer.parseInt(a.replace("6", "5")) + Integer.parseInt(b.replace("6", "5"));
        max = Integer.parseInt(a.replace("5", "6")) + Integer.parseInt(b.replace("5", "6"));

        //최솟값, 최댓값
        System.out.println(min + " " + max);
    }
}
