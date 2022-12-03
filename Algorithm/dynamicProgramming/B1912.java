package Algorithm.dynamicProgramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * name         : B1912
 * version      : 1.0.0.1
 * date         : 2022-12-03
 * description  : 설명
 */
public class B1912 {
	static int[] arr;
	static Integer[] dp;
	static int max;
	public static void main(String[] args) {
		BufferedReader br;
		try {
		    br = new BufferedReader(new InputStreamReader(System.in));
			int testcase = Integer.parseInt(br.readLine());
			StringTokenizer stz = new StringTokenizer(br.readLine());
			arr = new int[testcase];
			dp = new Integer[testcase];
			for (int i = 0; i < testcase; i++) {
				arr[i] = Integer.parseInt(stz.nextToken());
			}
			max = dp[0] = arr[0];
			recursive(testcase - 1);
			System.out.println(max);
		} catch (IOException e) { e.printStackTrace(); }
	}
	static int recursive(int n) {
		if (dp[n] == null) {
			dp[n] = Math.max(recursive(n - 1) + arr[n], arr[n]);
			max = Math.max(dp[n], max);
		}
		return dp[n];
	}
}
