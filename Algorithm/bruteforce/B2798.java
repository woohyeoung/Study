package Algorithm.bruteforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B2798 {
	public static void main(String[] args) {
		BufferedReader br;
		try {
		    br = new BufferedReader(new InputStreamReader(System.in));
			int testcase = Integer.parseInt(br.readLine());
			StringTokenizer stz = new StringTokenizer(br.readLine());
			int[] ary = new int[testcase];
			for (int i = 0; i < testcase; i++) {
				ary[i] = Integer.parseInt(stz.nextToken());
			}
		} catch (IOException e) { e.printStackTrace(); }
	}
}
