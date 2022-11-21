package Algorithm.bruteforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B1018 {
	public static void main(String[] args) {
		BufferedReader br;
		try {
		    br = new BufferedReader(new InputStreamReader(System.in));
			StringTokenizer stz = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(stz.nextToken());
			int y = Integer.parseInt(stz.nextToken());
			int result = 64;
			boolean[][] ary = new boolean[x][y];
			for (int i = 0; i < x; i++) {
				String str = br.readLine();
				for (int j = 0; j < y; j++) {
					ary[i][j] = str.charAt(j) == 'W';

				}
			}

			for (int i = 0; i < x-7; i++) {
				for (int j = 0; j < y-7; j++) {
					int count = 0;
					boolean value = ary[i][j];
					for (int n = i; n < i + 8; n++) {
						for (int m = j; m < j + 8; m++) {
							if (ary[n][m] != value) {
								count++;
							}
							value = !value;
						}
						value = !value;
					}
					count = Math.min(count, 64-count);
					result = Math.min(result, count);
				}
			}
			System.out.println(result);
		} catch (IOException e) { e.printStackTrace(); }
	}

	static void dfs() {

	}
}
