package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main_1049_기타줄 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int lines = Integer.parseInt(st.nextToken());
        int brand = Integer.parseInt(st.nextToken());

        int[] sixPrice = new int[brand]; //6줄묶음 가격
        int[] onePrice = new int[brand]; //1줄당 가격
        for (int i = 0; i < brand; i++) {
            st = new StringTokenizer(br.readLine());
            sixPrice[i] = Integer.parseInt(st.nextToken());
            onePrice[i] = Integer.parseInt(st.nextToken());
        }
        //오름차순 정렬
        Arrays.sort(sixPrice);
        Arrays.sort(onePrice);

        //최솟값 출력해야 하기 때문에 가장 최소인 값으로 계산
        int six = sixPrice[0]; //가장 저렴한 6줄묶음 가격
        int one = onePrice[0]; //가장 저렴한 1줄 가격
        int price = 0;
        while (lines > 0) {
            if (lines >= 6) { //6줄 이상일 때
                if (six <= one || six <= one * 6) {//만약 6줄믂음이 1줄*6 가격보다 싸다면
                    price += six; //6줄 묶음 가격으로 구매
                } else {
                    price += one * 6; //1줄 * 6 가격으로 구매
                }
                lines -= 6;
            } else { //6줄 미만일 때
                if (six >= one && six >= one * lines) { //6줄묶음이 1줄가격보다 비싸고 & 필요한 줄의 총 가격보다 비싸면
                    price += one * lines; //1줄 가격으로 구매
                } else if (six < one * lines) { //6줄 묶음이 더 싸다면
                    price += six; //6줄 묶음 가격으로 구매
                }
                break; //6줄 이하니까 한번 계산 후 break
            }
        }
        System.out.println(price);
    }
}

