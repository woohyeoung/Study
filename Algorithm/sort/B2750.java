package Algorithm.sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B2750 {
	public static void main(String[] args) {
		BufferedReader br;
		StringBuilder sb = new StringBuilder();
		try {
		    br = new BufferedReader(new InputStreamReader(System.in));
		    int testcase = Integer.parseInt(br.readLine());
			int[] ary = new int[testcase];
			for (int i = 0; i < testcase; i++) {
				ary[i] = Integer.parseInt(br.readLine());
			}
			for (int i = 0; i < ary.length; i++) {
				for (int j = 0; j < ary.length-1; j++) {
					if (ary[j] > ary[j+1]) {
						int temp = ary[j];
						ary[j] = ary[j+1];
						ary[j+1] = temp;
					}
				}
			}
			for (int i : ary) {
				sb.append(i).append('\n');
			}
			System.out.println(sb);
		} catch (IOException e) { e.printStackTrace(); }
	}
}
