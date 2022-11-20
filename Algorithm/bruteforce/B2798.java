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
			StringTokenizer stz = new StringTokenizer(br.readLine());
			int testcase = Integer.parseInt(stz.nextToken());
			int compareValue = Integer.parseInt(stz.nextToken());
			int result = 0;
			stz = new StringTokenizer(br.readLine());
			int[] arr = new int[testcase];
			for (int i = 0; i < testcase; i++) {
				arr[i] = Integer.parseInt(stz.nextToken());
			}
			Outer: {
				for (int i = 0; i < testcase -2; i++) {
					for (int j = i + 1; j < testcase -1; j++) {
						for (int k = j + 1; k < testcase; k++) {
							int temp = arr[i] + arr[j] + arr[k];
							if (temp > compareValue) continue;
							if (temp > result) {
								result = temp;
							}
							if (result == compareValue) {
								break Outer;
							}
						}
					}
				}
			}
			System.out.println(result);
		} catch (IOException e) { e.printStackTrace(); }
	}
}
