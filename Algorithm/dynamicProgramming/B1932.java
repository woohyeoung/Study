package Algorithm.dynamicProgramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * name         : B1932
 * version      : 1.0.0.1
 * date         : 2022-12-05
 * description  : 설명
 */
public class B1932 {
	static int testcase;
	static int[][] arr;
	static Integer[][] dp;
	public static void main(String[] args) {
		BufferedReader br;
		StringTokenizer stz;
		try {
		    br = new BufferedReader(new InputStreamReader(System.in));
		    testcase = Integer.parseInt(br.readLine());
			arr = new int[testcase][testcase];
			dp = new Integer[testcase][testcase];
			for (int i = 0; i < testcase; i++) {
				stz = new StringTokenizer(br.readLine());
				for (int j = 0; j < i + 1; j++) {
					arr[i][j] = Integer.parseInt(stz.nextToken());
				}
			}
			for (int i = 0; i < testcase; i++) {
				dp[testcase - 1][i] = arr[testcase - 1][i];
			}
			System.out.println(dfs(0, 0));
		} catch (IOException e) { e.printStackTrace(); }
	}
	static int dfs(int x, int y) {
		if (x == testcase -1) {
			return dp[x][y];
		}
		if (dp[x][y] == null) {
			dp[x][y] = Math.max(dfs(x + 1, y), dfs(x + 1, y + 1)) + arr[x][y];
		}
		return dp[x][y];
	}
}
