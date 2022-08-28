package 백준.단계별로풀어보기.Lv25_그래프와순회;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class No11_7562 {
    private static int[] dx = {1, 2, 2, 1, -1, -2, -2, -1};
    private static int[] dy = {-2, -1, 1, 2, 2, 1, -1, -2};
    private static int l;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());
        StringTokenizer st;
        for (int testCase = 0; testCase < T; testCase++) {
            l = Integer.parseInt(br.readLine());
            boolean[][] isVisited = new boolean[l][l];
            st = new StringTokenizer(br.readLine());
            Locate start = new Locate(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()), 0);
            st = new StringTokenizer(br.readLine());
            Locate goal = new Locate(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()), 0);
            int min = getMinMoveBfs(start, goal, isVisited);
            bw.write(min + "\n");
        }
        bw.flush();
        bw.close();
    }

    private static int getMinMoveBfs(Locate start, Locate goal, boolean[][] isVisited) {
        if (start.x == goal.x && start.y == goal.y)
            return 0;

        Queue<Locate> queue = new LinkedList<>();
        queue.offer(start);
        isVisited[start.y][start.x] = true;
        while (!queue.isEmpty()) {
            Locate current = queue.poll();
            for (int i = 0; i < 8; i++) {
                int nx = current.x + dx[i];
                int ny = current.y + dy[i];
                if (nx == goal.x && ny == goal.y)
                    return current.cnt + 1;
                if (0 <= nx && nx < l && 0 <= ny && ny < l) {
                    if (isVisited[ny][nx] == false) {
                        queue.offer(new Locate(nx, ny, current.cnt + 1));
                        isVisited[ny][nx] = true;
                    }
                }
            }
        }
        return 0;
    }

    private static class Locate {
        int x;
        int y;
        int cnt;

        public Locate(int x, int y, int cnt) {
            this.x = x;
            this.y = y;
            this.cnt = cnt;
        }
    }
}
