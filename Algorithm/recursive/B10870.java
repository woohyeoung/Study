package Algorithm.recursive;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B10870 {
	static int testcase = 0;
	static int result = 0;
	public static void main(String[] args) {
		BufferedReader br;
		try {
		    br = new BufferedReader(new InputStreamReader(System.in));
		    testcase = Integer.parseInt(br.readLine());
			if (testcase > 0) {
				recursive(0, 1, 1);
			}
			System.out.println(result);
		} catch (IOException e) { e.printStackTrace(); }
	}
	static void recursive(int prev, int now, int cnt) {
		if (cnt == testcase) {
			result = now;
			return;
		}
		recursive(now, prev + now, ++cnt);
	}
}
