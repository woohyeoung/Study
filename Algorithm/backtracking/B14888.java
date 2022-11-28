package Algorithm.backtracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * package      : Algorithm.backtracking
 * name         : B14888
 * version      : 1.0.0.1
 * date         : 2022-11-28
 * description  : 설명
 */
public class B14888 {
	static int testcase;
	static int[] arr;
	static int[] operator = new int[4];
	static int MAX = Integer.MIN_VALUE;
	static int MIN = Integer.MAX_VALUE;
	public static void main(String[] args) {
		BufferedReader br;
		StringTokenizer stz;
		try {
		    br = new BufferedReader(new InputStreamReader(System.in));
			testcase = Integer.parseInt(br.readLine());
			arr = new int[testcase];
			stz = new StringTokenizer(br.readLine());
			for (int i = 0; i < testcase; i++) {
				arr[i] = Integer.parseInt(stz.nextToken());
			}
			stz = new StringTokenizer(br.readLine());
			for (int i = 0; i < 4; i++) {
				operator[i] = Integer.parseInt(stz.nextToken());
			}
			dfs(arr[0], 1);
			System.out.println(MAX + "\n" + MIN);
		} catch (IOException e) { e.printStackTrace(); }
	}
	static void dfs(int num, int index) {
		if (index == testcase) {
			MAX = Math.max(MAX, num);
			MIN = Math.min(MIN, num);
			return;
		}
		for (int i = 0; i < 4; i++) {
			if (operator[i] > 0) {
				operator[i]--;
				switch (i) {
					case 0:
						dfs(num + arr[index], index + 1);
						break;
					case 1:
						dfs(num - arr[index], index + 1);
						break;
					case 2:
						dfs(num * arr[index], index + 1);
						break;
					case 3:
						dfs(num / arr[index], index + 1);
						break;
				}
				operator[i]++;
			}
		}
	}
}
