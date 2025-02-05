package org.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main_1475_방번호 {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] roomNum = br.readLine().split("");
		Arrays.sort(roomNum);

		//0-9 한 세트
		int[] set = new int[10];
		for (int i = 0; i < roomNum.length; i++) {
			int n = Integer.parseInt(roomNum[i]);
			set[n]++;
		}

		int sixOrNine = set[6] + set[9];
		sixOrNine = (sixOrNine + 1) / 2;

		int max = 0;
		for (int i = 0; i < set.length; i++) {
			if (i != 6 && i != 9) {
				max = Math.max(max, set[i]);
			}

		}
		System.out.println(Math.max(sixOrNine, max));
	}
}
