package Algorithm.backtracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * package      : Algorithm.backtracking
 * name         : B15652
 * version      : 1.0.0.1
 * date         : 2022-11-25
 * description  : 설명
 */
public class B15652 {
	static StringBuilder sb = new StringBuilder();
	static int[] ary;
	public static void main(String[] args) {
		BufferedReader br;
		try {
			br = new BufferedReader(new InputStreamReader(System.in));
			StringTokenizer stz = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(stz.nextToken());
			int y = Integer.parseInt(stz.nextToken());
			ary = new int[y];
			dfs(x, y, 1, 0);
			System.out.println(sb);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	static void dfs(int x, int y, int n, int depth) {
		if (depth == y) {
			for (int i : ary) {
				sb.append(i).append(' ');
			}
			sb.append('\n');
			return;
		}
		for (int i = n; i <= x; i++) {
			ary[depth] = i;
			dfs(x, y, i, depth + 1);
		}
	}
}
