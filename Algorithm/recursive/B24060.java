package Algorithm.recursive;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B24060 {
	static int result = 0, k = 0, cnt = 0;
	static int[] ary, temp;
	public static void main(String[] args) {
		BufferedReader br;
		StringTokenizer stz;
		try {
		    br = new BufferedReader(new InputStreamReader(System.in));
			stz = new StringTokenizer(br.readLine());
			int arySize = Integer.parseInt(stz.nextToken());
			k = Integer.parseInt(stz.nextToken());
			stz = new StringTokenizer(br.readLine());
			int i = 0;
			ary = new int[arySize];
			temp = new int[arySize];
			while (stz.hasMoreTokens()) {
				ary[i++] = Integer.parseInt(stz.nextToken());
			}
			if (arySize * 2 + 2 > k) {
				mergeSort(0, ary.length - 1);
			} else {
				result = -1;
			}
			System.out.println(result);
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
		int i = p, j =q + 1, t = 0;
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
