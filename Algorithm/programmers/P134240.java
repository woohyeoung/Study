package Algorithm.programmers;

import java.util.Stack;

public class P134240 {
	public String solution(int[] food) {
		StringBuilder sb = new StringBuilder();
		Stack s = new Stack();
		for (int i = 0; i < food.length; i++) {
			if (food[i] == 1) {
				continue;
			}
			int n = (food[i]%2 == 0) ? food[i]/2 : (food[i]-1)/2;
			for (int j = 1; j <= n; j++) {
				s.push(i);
				sb.append(i);
			}
		}
		sb.append('0');
		while(!s.empty()) {
			sb.append(s.pop());
		}
		String answer = sb.toString();
		return answer;
	}
}
