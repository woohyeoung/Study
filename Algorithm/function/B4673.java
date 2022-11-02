package Algorithm.function;

public class B4673 {
	public static void main(String[] args) {
		boolean[] ary = new boolean[10001];
		StringBuilder sb = new StringBuilder();
		for (int i = 1; i < 10001; i++) {
			if (isSelf(i) < 10001) {
				ary[isSelf(i)] = true;
			}
		}
		for (int i = 1; i < 10001; i++) {
			if (ary[i]) {
				continue;
			}
			sb.append(i).append("\n");
		}
		System.out.println(sb);
	}
	static int isSelf(int n) {
		 int t = n;
		 while (n > 0) {
			 t += n%10;
			 n /= 10;
		 }
		 return t;
	}
}
