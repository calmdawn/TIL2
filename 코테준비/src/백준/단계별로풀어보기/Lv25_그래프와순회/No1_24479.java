package 백준.단계별로풀어보기.Lv25_그래프와순회;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class No1_24479 {
    private static int depth = 1;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int R = Integer.parseInt(st.nextToken());

        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();

        for (int i = 0; i <= N; i++) //정점별로 초기화
            graph.add(new ArrayList<>());

        for (int i = 0; i < M; i++) {//정점별 간선 추가
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            graph.get(u).add(v);
            graph.get(v).add(u);
        }
        for (int i = 0; i <= N; i++) //정점별로 오름차순 정리
            Collections.sort(graph.get(i));

        int[] visited = new int[N + 1];
        dfs(graph, R, visited);

        for (int i = 1; i <= N; i++)
            bw.write(visited[i] + "\n");
        bw.flush();
        bw.close();
    }

    private static void dfs(ArrayList<ArrayList<Integer>> graph, int R, int[] visited) {
        visited[R] = depth++;
        for (int r : graph.get(R)) {
            if (visited[r] == 0)
                dfs(graph, r, visited);
        }
    }
}
