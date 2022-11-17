package Algorithm.sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class B1181 {
	public static void main(String[] args) {
		BufferedReader br;
		StringBuilder sb = new StringBuilder();
		try {
		    br = new BufferedReader(new InputStreamReader(System.in));
		    int testcase = Integer.parseInt(br.readLine());
			String[] ary = new String[testcase];
			for (int i = 0; i < testcase; i++) {
				ary[i] = br.readLine();
			}
			Arrays.sort(ary, (o1, o2) -> {
				if (o1.length() == o2.length()) {
					for (int i = 0; i < o1.length(); i++) {
						if (o1.charAt(i) != o2.charAt(i)) {
							return o1.charAt(i) - o2.charAt(i);
						}
					}
					return 0;
				}
				return o1.length() - o2.length();
			});
			String str = "";
			for (String i : ary) {
				if (str.equals(i)) {
					continue;
				}
				sb.append(i).append('\n');
				str = i;
			}
			System.out.println(sb);
		} catch (IOException e) { e.printStackTrace(); }
	}
}
