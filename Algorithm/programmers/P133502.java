package Algorithm.programmers;

public class P133502 {
	public int solution(int[] ingredient) {
		int result = 0;
		StringBuilder sb = new StringBuilder();
		for (int i : ingredient) {
			sb.append(i);
			if (sb.length() > 3 && sb.subSequence(sb.length()-4, sb.length()).equals("1231")) {
				result++;
				sb.delete(sb.length()-4, sb.length());
			}
		}
		return result;
	}
}
