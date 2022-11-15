package Algorithm.sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B2751 {
	static int[] ary, temp;
	static int cnt = 0, result = 0, k = 0;
	public static void main(String[] args) {
		BufferedReader br;
		StringBuilder sb = new StringBuilder();
		try {
		    br = new BufferedReader(new InputStreamReader(System.in));
		    int testcase = Integer.parseInt(br.readLine());
			ary = new int[testcase];
			temp = new int[testcase];
			for (int i = 0; i < testcase; i++) {
				ary[i] = Integer.parseInt(br.readLine());
			}
			mergeSort(0, testcase - 1);
			for (int i = 0; i < testcase; i++) {
				sb.append(ary[i]).append('\n');
			}
			System.out.println(sb);
		} catch (IOException e) { e.printStackTrace(); }
	}
	static void mergeSort(int p, int r) {
		if (p < r) {
			int q = (p+r) /2;
			mergeSort(p, q);
			mergeSort(q + 1, r);
			merge(p, q, r);
		}
	}
	static void merge(int p, int q, int r) {
		int i = p, j = q + 1, t = 0;
		while (i <= q && j <= r) {
			if (ary[i] <= ary[j]) {
				temp[t++] = ary[i++];
			} else {
				temp[t++] = ary[j++];
			}
		}
		while (i <= q) {
			temp[t++] = ary[i++];
		}
		while (j <= r) {
			temp[t++] = ary[j++];
		}
		i = p; t = 0;
		while (i <= r) {
			cnt++;
			if (cnt == k) {
				result = temp[t];
				break;
			}
			ary[i++] = temp[t++];
		}
	}
}
