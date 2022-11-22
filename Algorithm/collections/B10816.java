package Algorithm.collections;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

/**
 * package      : Algorithm.collections
 * name         : B10816
 * version      : 1.0.0.1
 * date         : 2022-11-22
 * description  : 설명
 */
public class B10816 {
	public static void main(String[] args) {
		BufferedReader br;
		StringTokenizer stz;
		StringBuilder sb = new StringBuilder();
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		try {
		    br = new BufferedReader(new InputStreamReader(System.in));
		    int testcase = Integer.parseInt(br.readLine());
			stz = new StringTokenizer(br.readLine());
			for (int i = 0; i < testcase; i++) {
				String str = stz.nextToken();
				if (map.containsKey(str)) {
					map.put(str, map.get(str) + 1);
				} else {
					map.put(str, 1);
				}
			}
			int compareCard = Integer.parseInt(br.readLine());
			stz = new StringTokenizer(br.readLine());
			for (int i = 0; i < compareCard; i++) {
				String str = stz.nextToken();
				if (map.containsKey(str)) {
					sb.append(map.get(str)).append(' ');
				} else {
					sb.append(0).append(' ');
				}
			}
			System.out.println(sb);
		} catch (IOException e) { e.printStackTrace(); }
	}
}
