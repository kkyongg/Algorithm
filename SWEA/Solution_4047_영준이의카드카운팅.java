package SWEA;

import java.io.BufferedReader;
import java.io.InputStreamReader;

class Solution_4047_영준이의카드카운팅 {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(br.readLine());

        for (int i = 1; i < testCase + 1; i++) {
            StringBuilder cardResult;
            int result = 0; // 겹치는 카드가 있을 때 거르기 위해 생성

            String s = br.readLine();
            int length = s.length() / 3; //카드별로 배열에 저장해야해서 문자열 길이 / 3 해줌
            String[] sArr = new String[length];

            for (int j = 0; j < length; j++) {
                if (s.length() == 0) { //겹치는 카드가 있었을 경우 이미 25줄에서 삭제됐기 때문에 문자 길이가 0일것임
                    result = 1;
                    break;
                } else {
                    sArr[j] = s.substring(0, 3);
                    s = s.replace(sArr[j], ""); //파싱 후 문자열 삭제
                }

            }

            //result가 1일 경우 ERROR
            if (result == 1) {
                System.out.println("#" + i + " " + "ERROR");
            } else {
                cardResult = checkCard(sArr);
                System.out.println("#" + i + " " + cardResult);
            }
        }
    }

    public static StringBuilder checkCard(String[] strArr) {
        StringBuilder sb = null;

        //각 카드별로 배열 생성
        int[] sArr = new int[13];
        int[] dArr = new int[13];
        int[] hArr = new int[13];
        int[] cArr = new int[13];

        int s = 0;
        int d = 0;
        int h = 0;
        int c = 0;

        for (int r = 0; r < strArr.length; r++) {

            sb = new StringBuilder();

            char pattern = strArr[r].charAt(0); //무늬 확인
            int cardNum = Integer.parseInt(strArr[r].substring(1, 3)); // 카드 넘버

            if (pattern == 'S') {
                sArr[cardNum - 1]++;
                s++;
            } else if (pattern == 'D') {
                dArr[cardNum - 1]++;
                d++;
            } else if (pattern == 'H') {
                hArr[cardNum - 1]++;
                h++;
            } else if (pattern == 'C') {
                cArr[cardNum - 1]++;
                c++;
            }
        }

        sb.append(13 - s).append(" ").append(13 - d).append(" ").append(13 - h).append(" ").append(13 - c);

        return sb;
    }
}