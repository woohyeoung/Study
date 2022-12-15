package Algorithm.programmers;

import java.util.HashMap;

/**
 * name         : P142086
 * version      : 1.0.0.1
 * date         : 2022-12-15
 * description  : 설명
 */
public class P142086 {
	public int[] solution(String s) {
		HashMap<Character, Integer> alpha = new HashMap<>();
		int[] result = new int[s.length()];

		for (int i = 0; i < s.length(); i++) {
			if (!alpha.containsKey(s.charAt(i))) result[i] = -1;
			else result[i] = i - alpha.get(s.charAt(i));
			alpha.put(s.charAt(i), i);
		}
		return result;
	}
}
