package Algorithm.function;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B15596 {
	public static void main(String[] args) {
		BufferedReader br;
		try {
		    br = new BufferedReader(new InputStreamReader(System.in));
			int testcase = Integer.parseInt(br.readLine());
			int[] ary = new int[testcase];
			for (int i = 0; i < testcase; i++) {
				ary[i] = i;
			}
			long result = sum(ary);
			System.out.println(result);
		} catch (IOException e) { e.printStackTrace(); }
	}
	static long sum(int[] a) {
		long result = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] > 1000000) {
				continue;
			}
			result += a[i];
		}
		return result;
	}
}
