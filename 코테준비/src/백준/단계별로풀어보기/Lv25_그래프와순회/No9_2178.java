package 백준.단계별로풀어보기.Lv25_그래프와순회;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class No9_2178 {
    private static int[] dx = {0, 0, -1, 1};    //상하좌우
    private static int[] dy = {-1, 1, 0, 0};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[][] map = new int[N][M];

        for (int i = 0; i < N; i++) {
            String input = br.readLine();
            for (int j = 0; j < M; j++) {
                map[i][j] = input.charAt(j) - '0';
            }
        }

        bw.write(String.valueOf(bfs(map, N, M)));
        bw.flush();
        bw.close();
    }

    private static int bfs(int[][] map, int N, int M) {
        Queue<Integer> queueX = new LinkedList<>();
        Queue<Integer> queueY = new LinkedList<>();
        queueX.add(0);
        queueY.add(0);
        map[0][0] = 1;

        int len = 1;
        while (!queueX.isEmpty() && !queueY.isEmpty()) {
            int x = queueX.poll();
            int y = queueY.poll();

            if (x == M - 1 && y == N - 1) {
                len = map[y][x];
                break;
            }
            for (int i = 0; i < 4; i++) {
                int tX = x + dx[i];
                int tY = y + dy[i];
                if ((0 <= tX && tX < M) && (0 <= tY && tY < N) && map[tY][tX] == 1) {
                    queueX.add(tX);
                    queueY.add(tY);
                    map[tY][tX] = map[tY][tX] + map[y][x];
                }
            }
        }
        return len;
    }
}

