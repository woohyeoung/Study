package Algorithm.programmers;

/**
 * name         : P140108
 * version      : 1.0.0.1
 * date         : 2022-12-06
 * description  : 설명
 */
public class P140108 {
	public int solution(String s) {
		char first = s.charAt(0);
		int count = 0;
		int diff = 0;
		int answer = 0;
		for (int i = 0; i < s.length(); i++) {
			if (count == diff) {
				answer++;
				first = s.charAt(i);
			}
			if (first == s.charAt(i)) {
				count++;
			} else {
				diff++;
			}
		}
		return answer;
	}
}
