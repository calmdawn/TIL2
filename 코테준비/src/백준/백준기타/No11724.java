package 백준.백준기타;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class No11724 {
    private static boolean[] isNum;
    private static boolean[] isVisited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        isNum = new boolean[N + 1];
        isVisited = new boolean[N + 1];
        List<Integer>[] graph = new ArrayList[N + 1];
        for (int i = 1; i <= N; i++) {
            graph[i] = new ArrayList<>();
            isNum[i] = true;
        }

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            graph[u].add(v);
            graph[v].add(u);
        }
        int cnt = 0;
        for (int i = 1; i <= N; i++) {
            if (isVisited[i] == false && isNum[i] == true) { //방문하지 않은경우, 정점이 있는경우
                cnt++;
                dfs(i, graph);
            }
        }
        bw.write(String.valueOf(cnt));
        bw.flush();
        bw.close();
    }

    private static void dfs(int current, List<Integer>[] graph) {
        isVisited[current] = true;
        for (int idx : graph[current]) {
            if (isVisited[idx] == false) {
                dfs(idx, graph);
            }
        }
    }
}
