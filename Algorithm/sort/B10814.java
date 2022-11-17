package Algorithm.sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class B10814 {
	public static void main(String[] args) {
		BufferedReader br;
		StringTokenizer stz;
		StringBuilder sb = new StringBuilder();
		try {
		    br = new BufferedReader(new InputStreamReader(System.in));
			int testcase = Integer.parseInt(br.readLine());
			int[][] ary = new int[testcase][2];
			String[] arr = new String[testcase];
			for (int i = 0; i < testcase; i++) {
				stz = new StringTokenizer(br.readLine());
				ary[i][0] = Integer.parseInt(stz.nextToken());
				ary[i][1] = i;
				arr[i] = stz.nextToken();
			}
			Arrays.sort(ary, Comparator.comparingInt(o -> o[0]));
			for (int[] i : ary) {
				sb.append(i[0]).append(' ').append(arr[i[1]]).append('\n');
			}
			System.out.println(sb);
		} catch (IOException e) { e.printStackTrace(); }
	}
}
