package 백준.단계별로풀어보기.Lv25_그래프와순회;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class No10_7576 {
    static private int tomatoCnt = 0;   //익지 않은 토마토개수
    static private Queue<int[]> queue = new LinkedList<>();
    static private int M;
    static private int N;
    static private int[] dx = {0, 0, -1, 1};   //상하좌우
    static private int[] dy = {-1, 1, 0, 0};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        M = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());
        int[][] boxes = new int[N][M];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                boxes[i][j] = Integer.parseInt(st.nextToken());
                if (boxes[i][j] == 1)
                    queue.add(new int[]{i, j, 0});
                else if (boxes[i][j] == 0)
                    tomatoCnt++;
            }
        }
        if (tomatoCnt == 0)
            bw.write("0");
        else
            bw.write(bfs(boxes));

        bw.flush();
        bw.close();
    }

    private static String bfs(int[][] boxes) {
        int day = 0;

        while (!queue.isEmpty()) {
            int[] idxes = queue.poll();
            day = idxes[2];

            for (int k = 0; k < 4; k++) {
                int i = idxes[0] + dy[k];
                int j = idxes[1] + dx[k];
                if ((0 <= i && i < N) && (0 <= j && j < M)) {
                    if (boxes[i][j] == 0) {
                        boxes[i][j] = 1;
                        queue.add(new int[]{i, j, idxes[2] + 1});
                        tomatoCnt--;
                    }
                }
            }
        }

        if (tomatoCnt == 0)
            return String.valueOf(day);
        else
            return "-1";
    }
}

