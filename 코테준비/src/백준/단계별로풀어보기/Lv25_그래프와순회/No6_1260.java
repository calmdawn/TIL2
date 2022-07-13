package 백준.단계별로풀어보기.Lv25_그래프와순회;

import java.io.*;
import java.util.*;

public class No6_1260 {

    private static StringBuffer sbResult;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int V = Integer.parseInt(st.nextToken());
        sbResult = new StringBuffer();
        ArrayList<Integer>[] graph = new ArrayList[N + 1];
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

        dfs(graph, V, new boolean[N + 1]);
        bw.write(sbResult.toString().trim() + "\n");
        sbResult.setLength(0);

        bfs(graph, V, new boolean[N + 1]);
        bw.write(sbResult.toString().trim());

        bw.flush();
        bw.close();
    }

    private static void bfs(ArrayList<Integer>[] graph, int startN, boolean[] isVisited) {
        isVisited[startN] = true;

        Queue<Integer> queue = new LinkedList<>();
        queue.add(startN);
        sbResult.append(startN).append(" ");

        while (!queue.isEmpty()) {
            for (int v : graph[queue.poll()]) {
                if (isVisited[v] == false) {
                    queue.add(v);
                    isVisited[v] = true;
                    sbResult.append(v).append(" ");
                }
            }
        }
    }

    private static void dfs(ArrayList<Integer>[] graph, int startN, boolean[] isVisited) {
        isVisited[startN] = true;
        sbResult.append(startN).append(" ");
        for (int v : graph[startN]) {
            if (isVisited[v] == false)
                dfs(graph, v, isVisited);
        }
    }

}
