package Algorithm.sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B2587 {
	public static void main(String[] args) {
		BufferedReader br;
		try {
		    br = new BufferedReader(new InputStreamReader(System.in));
			int[] ary = new int[5];
			int res = 0;
			for (int i = 0; i < 5; i++) {
				ary[i] = Integer.parseInt(br.readLine());
				res += ary[i];
			}
			for (int i = 0; i < 5; i++) {
				for (int j = i; j < 5; j++) {
					if (ary[i] > ary[j]) {
						int temp = ary[j];
						ary[j] = ary[i];
						ary[i] = temp;
					}
				}
			}
			System.out.println(res/5);
			System.out.println(ary[2]);
		} catch (IOException e) { e.printStackTrace(); }
	}
}
