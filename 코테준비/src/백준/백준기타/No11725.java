package 백준.백준기타;

import java.io.*;
import java.util.*;

public class No11725 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        List<Integer>[] tree = new ArrayList[N + 1];
        StringTokenizer st;
        for (int i = 1; i <= N; i++)
            tree[i] = new ArrayList<>();
        for (int i = 1; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            tree[u].add(v);
            tree[v].add(u);
        }
        int[] isVisited = new int[N + 1];
        bfs(1, isVisited, tree);
        for (int i = 2; i <= N; i++)
            bw.write(isVisited[i] + "\n");
        bw.flush();
        bw.close();
    }

    private static void bfs(int root, int[] isVisited, List<Integer>[] tree) {
        isVisited[root] = 1;
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            int parent = queue.poll();
            for (int child : tree[parent]) {    //부모노드번호를 저장
                if (isVisited[child] == 0) {
                    isVisited[child] = parent;
                    queue.offer(child);
                }
            }
        }
    }
}
