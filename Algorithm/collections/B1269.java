package Algorithm.collections;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

/**
 * package      : Algorithm.collections
 * name         : B1269
 * version      : 1.0.0.1
 * date         : 2022-11-23
 * description  : 설명
 */
public class B1269 {
	public static void main(String[] args) {
		BufferedReader br;
		StringTokenizer stz ;
		Set<String> set = new HashSet<>();
		try {
		    br = new BufferedReader(new InputStreamReader(System.in));
		    stz = new StringTokenizer(br.readLine());
			int A = Integer.parseInt(stz.nextToken());
			int B = Integer.parseInt(stz.nextToken());
			stz = new StringTokenizer(br.readLine());
			for (int i = 0; i < A; i++) {
				set.add(stz.nextToken());
			}
			int count = 0;
			stz = new StringTokenizer(br.readLine());
			for (int i = 0; i < B; i++) {
				if (set.contains(stz.nextToken())) {
					count++;
				}
			}
			System.out.println(A+B-(count*2));
		} catch (IOException e) { e.printStackTrace(); }
	}
}
