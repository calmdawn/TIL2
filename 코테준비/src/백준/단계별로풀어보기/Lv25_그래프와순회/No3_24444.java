package 백준.단계별로풀어보기.Lv25_그래프와순회;

import java.io.*;
import java.util.*;

public class No3_24444 {
    private static int depth = 1;
    private static ArrayList<Integer>[] graph;
    private static boolean[] isVisited;
    private static int[] results;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int R = Integer.parseInt(st.nextToken());
        graph = new ArrayList[N + 1];
        isVisited = new boolean[N + 1];
        results = new int[N + 1];

        for (int i = 1; i <= N; i++)
            graph[i] = new ArrayList<>();

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            graph[u].add(v);
            graph[v].add(u);
        }

        for (int i = 1; i <= N; i++)
            Collections.sort(graph[i]);
        bfs(graph, R);

        for (int i = 1; i <= N; i++)
            bw.write(results[i] + "\n");
        bw.flush();
        bw.close();
    }

    private static void bfs(ArrayList<Integer>[] graph, int R) {
        Queue<Integer> queue = new LinkedList<>();
        isVisited[R] = true;
        results[R] = depth++;
        queue.add(R);

        while (!queue.isEmpty()) {
            for (int v : graph[queue.poll()]) {
                if (isVisited[v] == false) {
                    queue.add(v);
                    isVisited[v] = true;
                    results[v] = depth++;
                }
            }
        }
    }
}
