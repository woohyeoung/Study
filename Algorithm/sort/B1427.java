package Algorithm.sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class B1427 {
	public static void main(String[] args) {
		BufferedReader br;
		StringBuilder sb = new StringBuilder();
		try {
		    br = new BufferedReader(new InputStreamReader(System.in));
		    String str = br.readLine();
			Character[] ary = new Character[str.length()];
			for (int i = 0; i < str.length(); i++) {
				ary[i] = str.charAt(i);
			}
			Arrays.sort(ary, Collections.reverseOrder());
			for (Character i : ary) {
				sb.append(i);
			}
			System.out.println(sb);
		} catch (IOException e) { e.printStackTrace(); }
	}
}
