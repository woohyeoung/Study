package Algorithm.collections;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 * package      : Algorithm.collections
 * name         : B1764
 * version      : 1.0.0.1
 * date         : 2022-11-23
 * description  : 설명
 */
public class B1764 {
	public static void main(String[] args) {
		BufferedReader br;
		StringBuilder sb = new StringBuilder();
		Set<String> set = new HashSet<>();
		List<String> list = new ArrayList<>();
		int count = 0;
		try {
		    br = new BufferedReader(new InputStreamReader(System.in));
			StringTokenizer stz = new StringTokenizer(br.readLine());
			int hear = Integer.parseInt(stz.nextToken());
			int see = Integer.parseInt(stz.nextToken());
			for (int i = 0; i < hear+see; i++) {
				String str = br.readLine();
				if (set.contains(str)) {
					count++;
					list.add(str);
				} else {
					set.add(str);
				}
			}
			Collections.sort(list);
			sb.append(count).append('\n');
			for (String s : list) {
				sb.append(s).append('\n');
			}
			System.out.println(sb);
		} catch (IOException e) { e.printStackTrace(); }
	}
}
