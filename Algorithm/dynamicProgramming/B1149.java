package Algorithm.dynamicProgramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * name         : B1149
 * version      : 1.0.0.1
 * date         : 2022-12-04
 * description  : 설명
 */
public class B1149 {
	static int[][] arr, dp;
	public static void main(String[] args) {
		BufferedReader br;
		StringTokenizer stz;
		try {
		    br = new BufferedReader(new InputStreamReader(System.in));
			int testcase = Integer.parseInt(br.readLine());
			arr = new int[testcase][3];
			dp = new int[testcase][3];
			for (int i = 0; i < testcase; i++) {
				stz = new StringTokenizer(br.readLine());
				arr[i][0] = Integer.parseInt(stz.nextToken());
				arr[i][1] = Integer.parseInt(stz.nextToken());
				arr[i][2] = Integer.parseInt(stz.nextToken());
			}
			dp[0][0] = arr[0][0];
			dp[0][1] = arr[0][1];
			dp[0][2] = arr[0][2];
			System.out.println(Math.min(cost(testcase - 1, 0), Math.min(cost(testcase - 1, 1), cost(testcase - 1, 2))));
		} catch (IOException e) { e.printStackTrace(); }
	}
	static int cost(int n, int color) {
		if (dp[n][color] == 0) {
			if (color == 0) {
				dp[n][0] = Math.min(cost(n - 1, 1), cost(n - 1, 2)) + arr[n][0];
			} else if (color == 1) {
				dp[n][1] = Math.min(cost(n - 1, 0), cost(n - 1, 2)) + arr[n][1];
			} else {
				dp[n][2] = Math.min(cost(n - 1, 0), cost(n - 1, 1)) + arr[n][2];
			}
		}
		return dp[n][color];
	}
}
