package Algorithm.sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class B18870 {
	public static void main(String[] args) {
		BufferedReader br;
		StringBuilder sb = new StringBuilder();
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		try {
		    br = new BufferedReader(new InputStreamReader(System.in));
		    int testcase = Integer.parseInt(br.readLine());
			StringTokenizer stz = new StringTokenizer(br.readLine());
			int[] org_arr = new int[testcase];
			int[] sort_arr = new int[testcase];
			for (int i  = 0; i < testcase; i++) {
				org_arr[i] = Integer.parseInt(stz.nextToken());
				sort_arr[i] = org_arr[i];
			}
			Arrays.sort(sort_arr);
			int n = 0;
			for (int i : sort_arr) {
				if (!map.containsKey(i)) {
					map.put(i, n);
					n++;
				}
			}
			for (int i : org_arr) {
				sb.append(map.get(i)).append(' ');
			}
			System.out.println(sb);
		} catch (IOException e) { e.printStackTrace(); }
	}
}
