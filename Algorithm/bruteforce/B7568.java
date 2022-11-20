package Algorithm.bruteforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B7568 {
	public static void main(String[] args) {
		BufferedReader br;
		StringTokenizer stz;
		StringBuilder sb = new StringBuilder();
		try {
		    br = new BufferedReader(new InputStreamReader(System.in));
		    int testcase = Integer.parseInt(br.readLine());
			int[][] ary = new int[testcase][3];
			for (int i = 0; i < testcase; i++) {
				stz = new StringTokenizer(br.readLine());
				ary[i][0] = Integer.parseInt(stz.nextToken());
				ary[i][1] = Integer.parseInt(stz.nextToken());
			}
			for (int i = 0; i < testcase; i++) {
				int k = 0;
				for (int j = 0; j < testcase; j++) {
					if (ary[i][0] < ary[j][0]
							&& ary[i][1] < ary[j][1]) {
						k++;
					}
				}
				ary[i][2] = k + 1;
			}
			for (int[] i : ary) {
				sb.append(i[2]).append(' ');
			}
			System.out.println(sb);
		} catch (IOException e) { e.printStackTrace(); }
	}
}
