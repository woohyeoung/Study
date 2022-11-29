package Algorithm.backtracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * package      : Algorithm.backtracking
 * name         : B14889
 * version      : 1.0.0.1
 * date         : 2022-11-29
 * description  : 설명
 */
public class B14889 {
	static boolean[] visited;
	static int[][] arr;
	static int testcase, result = Integer.MAX_VALUE;
	public static void main(String[] args) {
		BufferedReader br;
		StringTokenizer stz;
		try {
		    br = new BufferedReader(new InputStreamReader(System.in));
			testcase = Integer.parseInt(br.readLine());
			visited = new boolean[testcase];
			arr = new int[testcase][testcase];
			for (int i = 0; i < testcase; i++) {
				stz = new StringTokenizer(br.readLine());
				for (int j = 0; j < testcase; j++) {
					 arr[i][j] = Integer.parseInt(stz.nextToken());
				}
			}
			dfs(0, 0);
			System.out.println(result);
		} catch (IOException e) { e.printStackTrace(); }
	}
	static void dfs(int index, int count) {
		if (count == testcase /2) {
			diff();
			return;
		}
		for (int i = index; i < testcase; i++) {
			if (!visited[i]) {
				visited[i] = true;
				dfs(i + 1, count + 1);
				visited[i] = false;
			}
		}
	}
	static void diff() {
		int team1 = 0;
		int team2 = 0;
		for (int i = 0; i < testcase - 1; i++) {
			for (int j = i + 1; j < testcase; j++) {
				if (visited[i] && visited[j]) {
					team1 += arr[i][j];
					team1 += arr[j][i];
				} else if (!visited[i] && !visited[j]) {
					team2 += arr[i][j];
					team2 += arr[j][i];
				}
			}
		}
		int val = Math.abs(team1 - team2);
		if (val == 0) {
			System.out.println(val);
			System.exit(0);
		}
		result = Math.min(val, result);
	}
}
