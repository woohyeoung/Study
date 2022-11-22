package Algorithm.collections;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class B10815 {
	public static void main(String[] args) {
		BufferedReader br;
		StringTokenizer stz;
		StringBuilder sb = new StringBuilder();
		try {
		    br = new BufferedReader(new InputStreamReader(System.in));
			int hasCard = Integer.parseInt(br.readLine());
			Set<String> set = new HashSet<>();
			stz = new StringTokenizer(br.readLine());
			for (int i = 0; i < hasCard; i++) {
				set.add(stz.nextToken());
			}
			int compareCard = Integer.parseInt(br.readLine());
			stz = new StringTokenizer(br.readLine());
			for (int i = 0; i < compareCard; i++) {
				String temp = stz.nextToken();
				if (set.contains(temp)) {
					sb.append(1).append(' ');
				} else {
					sb.append(0).append(' ');
				}
			}
			System.out.println(sb);
		} catch (IOException e) { e.printStackTrace(); }
	}
}
