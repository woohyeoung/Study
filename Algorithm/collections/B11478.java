package Algorithm.collections;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

/**
 * package      : Algorithm.collections
 * name         : B11478
 * version      : 1.0.0.1
 * date         : 2022-11-23
 * description  : 설명
 */
public class B11478 {
	public static void main(String[] args) {
		BufferedReader br;
		Set<String> set = new HashSet<>();
		try {
		    br = new BufferedReader(new InputStreamReader(System.in));
		    String str = br.readLine();
			for (int i = 1; i <= str.length(); i++) {
				for (int j = 0; j <= str.length() - i; j++) {
					set.add(str.substring(j, j+i));
				}
			}
			System.out.println(set.size());
		} catch (IOException e) { e.printStackTrace(); }
	}
}
