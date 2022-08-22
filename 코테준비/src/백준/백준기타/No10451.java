package 백준.백준기타;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class No10451 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());
        StringTokenizer st;
        for (int testCase = 0; testCase < T; testCase++) {
            int N = Integer.parseInt(br.readLine());
            st = new StringTokenizer(br.readLine());
            List<Integer>[] graph = new List[N + 1];
            for (int i = 1; i <= N; i++)
                graph[i] = new ArrayList<Integer>();
            for (int i = 1; i <= N; i++) {
                int v = Integer.parseInt(st.nextToken());
                graph[i].add(v);
                graph[v].add(i);
            }
            boolean[] isVisited = new boolean[N + 1];
            int cycleCnt = 0;
            for (int i = 1; i <= N; i++) {
                if (isVisited[i] == false) {
                    cycleCnt++;
                    dfs(i, isVisited, graph);
                }
            }
            bw.write(cycleCnt + "\n");
        }
        bw.flush();
        bw.close();
    }

    private static void dfs(int current, boolean[] isVisited, List<Integer>[] graph) {
        isVisited[current] = true;
        for (int next : graph[current]) {
            if (isVisited[next] == false) {
                dfs(next, isVisited, graph);
            }
        }
    }
}
