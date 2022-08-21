package 백준.단계별로풀어보기.Lv25_그래프와순회;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class No16_1707 {
    private static boolean state;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());
        StringTokenizer st;
        for (int testCase = 0; testCase < T; testCase++) {
            st = new StringTokenizer(br.readLine());
            int V = Integer.parseInt(st.nextToken());   //정점의 개수
            int E = Integer.parseInt(st.nextToken());   //간선의 개수
            int[] isVisited = new int[V + 1];   //0미방문, 1 or 2 방문체크
            List<Integer>[] graph = new ArrayList[V + 1];
            state = true;
            for (int i = 1; i <= V; i++)
                graph[i] = new ArrayList<>();

            for (int i = 0; i < E; i++) {
                st = new StringTokenizer(br.readLine());
                int u = Integer.parseInt(st.nextToken());
                int v = Integer.parseInt(st.nextToken());
                graph[u].add(v);
                graph[v].add(u);
            }
            for (int i = 1; i <= V; i++) {
                if (isVisited[i] == 0)
                    dfs(i, isVisited, graph, 1);
            }
            if (state)
                bw.write("YES");
            else
                bw.write("NO");
            bw.write("\n");
        }
        bw.flush();
        bw.close();
    }

    private static void dfs(int current, int[] isVisited, List<Integer>[] graph, int flag) {
        if (state == false)
            return;
        isVisited[current] = flag;
        for (int next : graph[current]) {
            if (isVisited[current] == isVisited[next]) {  //이미 방문했고 이분그래프가 아니라면
                state = false;
                return;
            } else if (isVisited[next] == 0) {
                if (flag == 1) {
                    dfs(next, isVisited, graph, 2);
                } else {
                    dfs(next, isVisited, graph, 1);
                }
            }
        }
    }
}
