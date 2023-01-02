package Algorithm.programmers;

/**
 * name         : P147355
 * version      : 1.0.0.1
 * date         : 2023-01-02
 * description  : 설명
 */
public class P147355 {
	public int solution(String t, String p) {
		int len = p.length();
		long num = Long.parseLong(p);
		int result = 0;

		for (int i = 0; i < t.length() - len + 1; i++) {
			long diff = Long.parseLong(t.substring(i, i + len));
			if (diff <= num) result++;
		}
		return result;
	}
}
