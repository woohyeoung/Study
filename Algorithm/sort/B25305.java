package Algorithm.sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B25305 {
	public static void main(String[] args) {
		BufferedReader br;
		StringTokenizer stz;
		try {
		    br = new BufferedReader(new InputStreamReader(System.in));
			stz = new StringTokenizer(br.readLine());
			int testcase = Integer.parseInt(stz.nextToken());
			int prize = Integer.parseInt(stz.nextToken());
			int[] ary = new int[testcase];
			stz = new StringTokenizer(br.readLine());
			for (int i = 0; i < testcase; i++) {
				ary[i] = Integer.parseInt(stz.nextToken());
			}
			for (int i = 0; i < testcase; i++) {
				for (int j = i; j < testcase; j++) {
					if (ary[i] < ary[j]) {
						int temp = ary[j];
						ary[j] = ary[i];
						ary[i] = temp;
					}
				}
			}
			System.out.println(ary[prize-1]);
		} catch (IOException e) { e.printStackTrace(); }
	}
}
