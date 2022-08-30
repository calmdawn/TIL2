package 백준.단계별로풀어보기.Lv25_그래프와순회;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class No14_16928 {
    private static int[] infos;
    private static boolean[] isVisited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        infos = new int[101];    //사다리와 뱀의 정보를 포함할 정보들
        isVisited = new boolean[101];
        for (int i = 1; i <= 100; i++) {
            infos[i] = i;
        }
        for (int i = 0; i < N; i++) {   //사다리 정보
            st = new StringTokenizer(br.readLine());
            infos[Integer.parseInt(st.nextToken())] = Integer.parseInt(st.nextToken());
        }
        for (int i = 0; i < M; i++) {   //뱀의 정보
            st = new StringTokenizer(br.readLine());
            infos[Integer.parseInt(st.nextToken())] = Integer.parseInt(st.nextToken());
        }
        int minCnt = bfs(1);
        bw.write(String.valueOf(minCnt));
        bw.flush();
        bw.close();
    }

    private static int bfs(int start) {
        Queue<Data> queue = new LinkedList<>();
        isVisited[start] = true;
        queue.offer(new Data(start, 0));
        while (!queue.isEmpty()) {
            Data current = queue.poll();
            for (int i = 1; i <= 6; i++) {
                int next = current.locate + i;
                if (next >= 100)
                    return current.cnt + 1;
                if (isVisited[infos[next]] == false) {   //아직 방문안한경우
                    isVisited[infos[next]] = true;
                    queue.offer(new Data(infos[next], current.cnt + 1));
                }
            }
        }
        return 0;
    }

    private static class Data {
        int locate;
        int cnt;

        public Data(int locate, int cnt) {
            this.locate = locate;
            this.cnt = cnt;
        }
    }
}
