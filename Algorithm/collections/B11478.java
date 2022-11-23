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
		    String[] ary = br.readLine().split("");
			for (int i = 0; i < ary.length; i++) {
				String str = ary[i];
				set.add(str);
				for (int j = i +1; j < ary.length; j++) {
					str += ary[j];
					set.add(str);
				}
			}
			System.out.println(set.size());
		} catch (IOException e) { e.printStackTrace(); }
	}
}
