package Algorithm.bfsdfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class B1260 {
	static int[][] ary;
	static int[] visited;
	static StringBuilder sb = new StringBuilder();
	public static void main(String[] args) {
		BufferedReader br;
		StringTokenizer stz;
		try {
			br = new BufferedReader(new InputStreamReader(System.in));
			stz = new StringTokenizer(br.readLine());
			int nodeNum = Integer.parseInt(stz.nextToken());
			int lineNum = Integer.parseInt(stz.nextToken());
			int startNode = Integer.parseInt(stz.nextToken());
			ary = new int[nodeNum + 1][nodeNum + 1];

			for (int i = 0; i < lineNum; i++) {
				stz = new StringTokenizer(br.readLine());
				int a = Integer.parseInt(stz.nextToken());
				int b = Integer.parseInt(stz.nextToken());
				ary[a][b] = 1;
				ary[b][a] = 1;
			}
			visited = new int[nodeNum + 1];
			dfs(startNode);
			sb.append("\n");
			visited = new int[nodeNum + 1];
			bfs(startNode);
			System.out.println(sb);
		} catch (IOException ie) {
			ie.printStackTrace();
		}
	}
	static void bfs(int node) {
		Queue<Integer> q = new LinkedList<>();
		q.offer(node);
		visited[node] = 1;
		while (!q.isEmpty()) {
			node = q.poll();
			sb.append(node).append(' ');
			for (int i = 1; i < visited.length; i++) {
				if (ary[node][i] == 1 && visited[i] != 1) {
					visited[i] = 1;
					q.offer(i);
				}
			}
		}
	}
	static void dfs(int node) {
		visited[node] = 1;
		sb.append(node).append(' ');
		for (int i = 1; i < visited.length; i++) {
			if (ary[node][i] == 1 && visited[i] != 1) {
				dfs(i);
			}
		}
	}
}
