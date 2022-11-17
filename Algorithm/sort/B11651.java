package Algorithm.sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class B11651 {
	public static void main(String[] args) {
		BufferedReader br;
		StringBuilder sb = new StringBuilder();
		StringTokenizer stz;
		try {
		    br = new BufferedReader(new InputStreamReader(System.in));
		    int testcase = Integer.parseInt(br.readLine());
			int[][] ary = new int[testcase][2];
			for (int i = 0; i < testcase; i++) {
				stz = new StringTokenizer(br.readLine());
				ary[i][0] = Integer.parseInt(stz.nextToken());
				ary[i][1] = Integer.parseInt(stz.nextToken());
			}
			Arrays.sort(ary, (o1, o2) -> {
				if (o1[1] == o2[1]) {
					return o1[0]-o2[0];
				} else {
					return o1[1]-o2[1];
				}
			});
			for (int[] i : ary) {
				sb.append(i[0]).append(' ').append(i[1]).append('\n');
			}
			System.out.println(sb);
		} catch (IOException e) { e.printStackTrace(); }
	}
}
