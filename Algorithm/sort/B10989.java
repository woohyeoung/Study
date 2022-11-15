package Algorithm.sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B10989 {
	public static void main(String[] args) {
		BufferedReader br;
		StringBuilder sb = new StringBuilder();
		try {
		    br = new BufferedReader(new InputStreamReader(System.in));
			int testcase = Integer.parseInt(br.readLine());
			int[] ary = new int[10001];
			for (int i = 0; i < testcase; i++) {
				ary[Integer.parseInt(br.readLine())]++;
			}
			for (int i = 0; i < ary.length; i++) {
				if (ary[i] == 0) {
					continue;
				}
				for (int j = 0; j < ary[i]; j++) {
					sb.append(i).append('\n');
				}
			}
			System.out.println(sb);
		} catch (IOException e) { e.printStackTrace(); }
	}
}
