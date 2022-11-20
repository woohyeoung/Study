package Algorithm.bruteforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B2231 {
	public static void main(String[] args) {
		BufferedReader br;
		try {
		    br = new BufferedReader(new InputStreamReader(System.in));
		    int testcase = Integer.parseInt(br.readLine());
			int result = recursive(testcase);
			System.out.println(result);
		} catch (IOException e) { e.printStackTrace(); }
	}

	static int recursive(int testcase) {
		int result = 0, n = 0;
		for (int i = 1; i < testcase; i++ ) {
			for (int j = i; j > 0; j /= 10) {
				n += j%10;
			}
			if ((n + i) == testcase) {
				result = i;
				break;
			}
			n = 0;
		}
		return result;
	}
}
