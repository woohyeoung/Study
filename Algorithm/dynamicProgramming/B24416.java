package Algorithm.dynamicProgramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * package      : Algorithm.dynamicProgramming
 * name         : B24416
 * version      : 1.0.0.1
 * date         : 2022-11-30
 * description  : 설명
 */
public class B24416 {
	static int recur, dyna;
	public static void main(String[] args) {
		BufferedReader br;
		try {
		    br = new BufferedReader(new InputStreamReader(System.in));
			int testcase = Integer.parseInt(br.readLine());
			recursive(testcase);
			dp(testcase);
			System.out.println(recur + " " + dyna);
		} catch (IOException e) { e.printStackTrace(); }
	}
	static int recursive(int n) {
		if (n == 1 || n == 2) {
			recur++;
			return 1;
		}
		return (recursive(n - 1) + recursive(n - 2));
	}
	static int dp(int n) {
		int[] arr = new int[n];
		arr[0] = arr[1] = 1;
		for (int i = 2; i < n; i++) {
			dyna++;
			arr[i] = arr[i - 1] + arr[i - 2];
		}
		return arr[n - 1];
	}
}
