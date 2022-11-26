package Algorithm.backtracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * package      : Algorithm.backtracking
 * name         : B9663
 * version      : 1.0.0.1
 * date         : 2022-11-26
 * description  : 설명
 */
public class B9663 {
	static int[] ary;
	static int count = 0, n = 0;
	public static void main(String[] args) {
		BufferedReader br;
		try {
		    br = new BufferedReader(new InputStreamReader(System.in));
		    n = Integer.parseInt(br.readLine());
			ary = new int[n];
			dfs(0);
			System.out.println(count);
		} catch (IOException e) { e.printStackTrace(); }
	}
	static boolean checkRange(int num) {
		for (int i = 0; i < num; i++) {
			if (ary[num] == ary[i]
			|| num - i == Math.abs(ary[num] - ary[i])) {
				return false;
			}
		}
		return true;
	}
	static void dfs(int num) {
		if (num == n) {
			count++;
			return;
		}
		for (int i = 0; i < n; i++) {
			ary[num] = i;
			if (checkRange(num)) {
				dfs(num + 1);
			}
		}
	}
}
