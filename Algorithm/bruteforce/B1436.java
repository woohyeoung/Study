package Algorithm.bruteforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B1436 {
	public static void main(String[] args) {
		BufferedReader br;
		try {
		    br = new BufferedReader(new InputStreamReader(System.in));
			int testcase = Integer.parseInt(br.readLine());
			String str = "666";
			int num = 666;
			while (testcase > 0) {
				if (String.valueOf(num++).contains(str)) {
					testcase--;
				}
			}
			System.out.println(--num);
		} catch (IOException e) { e.printStackTrace(); }
	}
}
