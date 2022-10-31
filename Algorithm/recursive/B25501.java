package Algorithm.recursive;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B25501 {
	static String[] ary;
	static int count = 0;
	public static void main(String[] args) {
		BufferedReader br;
		try {
		    br = new BufferedReader(new InputStreamReader(System.in));
		    int testcase = Integer.parseInt(br.readLine());
			ary = new String[testcase];
			for (int i = 0; i < testcase; i++) {
				ary[i] = br.readLine();
			}
			System.out.println(isPalindrome());
		} catch (IOException e) { e.printStackTrace(); }
	}
	static String isPalindrome() {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < ary.length; i++) {
			count = 0;
			int res = recursive(0, ary[i], ary[i].length()%2==0 ? ary[i].length()/2 : (ary[i].length() -1)/2);
			if (i == ary.length - 1) {
				sb.append(res).append(' ').append(count);
			} else {
				sb.append(res).append(' ').append(count).append("\n");
			}
		}
		return sb.toString();
	}
	static Integer recursive(int cnt, String value, int endPoint) {
		count++;
		if (value.charAt(cnt) == value.charAt(value.length()-1 -cnt)) {
			if (cnt == endPoint) {
				return 1;
			}
			return recursive(++cnt, value, endPoint);
		}
		return 0;
	}
}
