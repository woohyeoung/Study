package Algorithm.dynamicProgramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * package      : Algorithm.dynamicProgramming
 * name         : B1904
 * version      : 1.0.0.1
 * date         : 2022-12-01
 * description  : 설명
 */
public class B1904 {
	static int[] arr = new int[1000001];
	public static void main(String[] args) {
		BufferedReader br;
		try {
		    br = new BufferedReader(new InputStreamReader(System.in));
			int testcase = Integer.parseInt(br.readLine());
			arr[0] = 0; arr[1] = 1; arr[2] = 2;
			for (int i = 3; i < arr.length; i++) {
				arr[i] = -1;
			}
			System.out.println(dp(testcase));
		} catch (IOException e) { e.printStackTrace(); }
	}
	static int dp(int n) {
		if (arr[n] == -1) {
			arr[n] = (dp(n - 1) + dp(n - 2))%15746;
		}
		return arr[n];
	}
}