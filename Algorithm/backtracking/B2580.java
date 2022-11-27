package Algorithm.backtracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * package      : Algorithm.backtracking
 * name         : B2580
 * version      : 1.0.0.1
 * date         : 2022-11-27
 * description  : 설명
 */
public class B2580 {
	static int[][] arr = new int[9][9];
	public static void main(String[] args) {
		BufferedReader br;
		StringTokenizer stz;
		try {
		    br = new BufferedReader(new InputStreamReader(System.in));
			for (int i = 0; i < 9; i++) {
				stz = new StringTokenizer(br.readLine(), " ");
				for (int j = 0; j < 9; j++) {
					arr[i][j] = Integer.parseInt(stz.nextToken());
				}
			}
			recursive(0, 0);
		} catch (IOException e) { e.printStackTrace(); }
	}
	static boolean checkNum(int x, int y, int value) {
		for (int i = 0; i < 9; i++) {
			if (arr[x][i] == value
			|| arr[i][y] == value) {
				return false;
			}
		}
		int min_x = (x / 3) * 3;
		int min_y = (y / 3) * 3;
		for (int i = min_x; i < min_x + 3; i++) {
			for (int j = min_y; j < min_y + 3; j++) {
				if (arr[i][j] == value) {
					return false;
				}
			}
		}
		return true;
	}
	static void recursive(int x, int y) {
		if (y == 9) {
			recursive(x + 1, 0);
			return;
		}
		if (x == 9) {
			StringBuilder sb = new StringBuilder();
			for (int[] i : arr) {
				for (int j : i) {
					sb.append(j).append(' ');
				}
				sb.append('\n');
			}
			System.out.println(sb);
			System.exit(0);
		}
		if (arr[x][y] == 0) {
			for (int i = 1; i <= 9; i++) {
				if (checkNum(x, y, i)) {
					arr[x][y] = i;
					recursive(x, y + 1);
				}
			}
			arr[x][y] = 0;
			return;
		}
		recursive(x, y + 1);
	}
}
