package Algorithm.recursive;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B2447 {
	static StringBuilder sb = new StringBuilder();
	static char[][] ary;
	public static void main(String[] args) {
		BufferedReader br;
		try {
		    br = new BufferedReader(new InputStreamReader(System.in));
			int testcase = Integer.parseInt(br.readLine());
			ary = new char[testcase][testcase];
			recursive(0, 0, testcase, false);
			for (char[] c : ary) {
				for (char r : c) {
					sb.append(r);
				}
				sb.append("\n");
			}
			System.out.println(sb);
		} catch (IOException e) { e.printStackTrace(); }
	}
	static void recursive(int x, int y, int size, boolean blank) {
		if (blank) {
			for (int i = x; i < x + size; i++) {
				for (int j = y; j < y + size; j++) {
					ary[i][j] = ' ';
				}
			}
			return;
		}
		if (size == 1) {
			ary[x][y] = '*';
			return;
		}
		int n = size /3;
		int count = 0;
		for (int i = x; i < x + size; i += n) {
			for (int j = y; j < y + size; j += n) {
				count++;
				recursive(i, j, n, count == 5);
			}
		}
	}
}
