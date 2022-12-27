package Algorithm.programmers;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;

/**
 * name         : P138476
 * version      : 1.0.0.1
 * date         : 2022-12-27
 * description  : 설명
 */
public class P138476 {
	public int solution(int k, int[] tangerine) {
		HashMap<Integer, Integer> map = new HashMap<>();
		int answer = 0;
		for (int i : tangerine) {
			if (map.containsKey(i)) {
				map.put(i, map.get(i) + 1);
			} else {
				map.put(i, 1);
			}
		}
		List<Integer> list = new ArrayList<>(map.values());
		list.sort(Comparator.reverseOrder());
		for (int i : list) {
			k -= i;
			answer++;
			if (k < 1) {
				break;
			}
		}
		return answer;
	}
}
