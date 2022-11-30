package Algorithm.dynamicProgramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * package      : Algorithm.dynamicProgramming
 * name         : B9184
 * version      : 1.0.0.1
 * date         : 2022-11-30
 * description  : 설명
 */
public class B9184 {
	static int[][][] abc = new int[21][21][21];
	public static void main(String[] args) {
		BufferedReader br;
		StringTokenizer stz;
		StringBuilder sb = new StringBuilder();
		try {
		    br = new BufferedReader(new InputStreamReader(System.in));
		    while (true) {
				stz = new StringTokenizer(br.readLine());
				int a = Integer.parseInt(stz.nextToken());
				int b = Integer.parseInt(stz.nextToken());
				int c = Integer.parseInt(stz.nextToken());
				if (a == -1 && b == -1 && c == -1) {
					break;
				}
				sb.append("w(").append(a).append(", ")
						.append(b).append(", ").append(c)
						.append(") = ").append(w(a, b, c)).append('\n');
			}
			System.out.println(sb);
		} catch (IOException e) { e.printStackTrace(); }
	}
	static int w(int a, int b, int c) {
		if (checkRange(a, b, c) && abc[a][b][c] != 0) {
			return abc[a][b][c];
		}
		if (a <= 0 || b <= 0 || c <= 0) {
			return 1;
		}
		if (a > 20 || b > 20 || c > 20) {
			return abc[20][20][20] = w(20, 20, 20);
		}
		if (a < b && b < c) {
			return abc[a][b][c] = w(a, b, c-1) + w(a, b-1, c-1) - w(a, b-1, c);
		}
		return abc[a][b][c] = w(a-1, b, c) + w(a-1, b-1, c) + w(a-1, b, c-1) - w(a-1, b-1, c-1);
	}
	static boolean checkRange(int a, int b, int c) {
		return 0 <= a && a <= 20 && 0 <= b && b <= 20 && 0 <= c && c <= 20;
	}
}
