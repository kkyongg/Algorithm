package SWEA;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class Solution_1206_view {

    public static int count;
    public static int[] allBuildingsData;
    public static List<Integer> compareBuildingsData;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st;
        for (int i = 0; i < 10; i++) { //10번의 테스트케이스
            int buildings = Integer.parseInt(br.readLine());
            allBuildingsData = new int[buildings];
            count = 0;
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < buildings; j++) {
                allBuildingsData[j] = Integer.parseInt(st.nextToken()); //건물 높이 배열에 저장
            }

            for (int k = 2; k < allBuildingsData.length - 2; k++) {
                compareBuildingsData = new ArrayList<>(); //list 생성해서 앞 2개 뒤 2개와 비교
                for (int j = k - 2; j < k + 3; j++) {
                    compareBuildingsData.add(allBuildingsData[j]);
                }
                compareData();
            }
            System.out.println("#" + (i + 1) + " " + count);
        }
    }

    static void compareData() {
        //compareArr 에서 비교

        int middle = compareBuildingsData.get(2);
        if (middle == 0) return; //기준 건물 높이가 0이면 조망권 확보 못함

        int first = middle - compareBuildingsData.get(0); //왼쪽 첫번째 건물
        int second = middle - compareBuildingsData.get(1); //왼쪽 두번째 건물
        int third = middle - compareBuildingsData.get(3); //오른쪽 첫번째 건물
        int fourth = middle - compareBuildingsData.get(4); //오른쪽 두번째 건물

        if (first < 0 || second < 0 || third < 0 || fourth < 0) { //비교해야할 건물이 기준보다 더 높으면 조망권 확보 실패
            return;
        }

        int[] buildings = new int[]{first, second, third, fourth};
        Arrays.sort(buildings); //차이가 가장 적은 건물을 찾아야 함

        count += buildings[0];
    }
}