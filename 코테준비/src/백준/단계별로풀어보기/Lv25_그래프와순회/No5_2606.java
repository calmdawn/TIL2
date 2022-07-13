package 백준.단계별로풀어보기.Lv25_그래프와순회;

import java.io.*;
import java.util.*;

public class No5_2606 {

    private static boolean[] isVisited;
    private static int virusCnt = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int pairCnt = Integer.parseInt(br.readLine());
        ArrayList<Integer>[] computers = new ArrayList[N + 1];
        isVisited = new boolean[N + 1];
        StringTokenizer st;

        for (int i = 1; i <= N; i++) {
            computers[i] = new ArrayList<>();
        }
        for (int i = 0; i < pairCnt; i++) {
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            computers[u].add(v);
            computers[v].add(u);
        }
        dfs(computers, 1);

        bw.write(String.valueOf(virusCnt - 1));
        bw.flush();
        bw.close();
    }

    private static void dfs(ArrayList<Integer>[] computers, int cNum) {
        isVisited[cNum] = true;
        virusCnt++;
        for (int com : computers[cNum]) {
            if (isVisited[com] == false)
                dfs(computers, com);
        }
    }
}
