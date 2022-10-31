package Algorithm.recursive;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B10872 {
	static int result = 0;
	public static void main(String[] args) {
		BufferedReader br;
		try {
			br = new BufferedReader(new InputStreamReader(System.in));
			result = Integer.parseInt(br.readLine());
			if (result > 0) {
				recursive(result);
			} else {
				result = 1;
			}
			System.out.println(result);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	static void recursive(int num) {
		if (num == 1) {
			return;
		}
		result *= --num;
		recursive(num);
	}
}
