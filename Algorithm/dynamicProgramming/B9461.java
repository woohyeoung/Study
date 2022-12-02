package Algorithm.dynamicProgramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * name         : B9461
 * version      : 1.0.0.1
 * date         : 2022-12-02
 * description  : 설명
 */
public class B9461 {
	static Long[] arr = new Long[101];
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		BufferedReader br;
		try {
		    br = new BufferedReader(new InputStreamReader(System.in));
		    int testcase = Integer.parseInt(br.readLine());
			arr[0] = 0L;
			arr[1] = arr[2] = arr[3] = 1L;
			for (int i = 0; i < testcase; i++) {
				sb.append(dp(Integer.parseInt(br.readLine()))).append('\n');
			}
			System.out.println(sb);
		} catch (IOException e) { e.printStackTrace(); }
	}
	static Long dp(int n) {
		if (arr[n] == null) {
			arr[n] = dp(n - 2) + dp(n - 3);
		}
		return arr[n];
	}
}
