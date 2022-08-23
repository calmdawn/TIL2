package 백준.백준기타;

import java.io.*;
import java.util.StringTokenizer;

public class No4963 {
    /**
     * 0 1 2
     * 7 x 3    //현재위치 x 에서 이동하려는 각 위치
     * 6 5 4
     */
    private static int w;
    private static int h;
    private static int[] dx = {-1, 0, 1, 1, 1, 0, -1, -1};
    private static int[] dy = {-1, -1, -1, 0, 1, 1, 1, 0};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        while (true) {
            st = new StringTokenizer(br.readLine());
            w = Integer.parseInt(st.nextToken());
            h = Integer.parseInt(st.nextToken());
            if (w == 0 && h == 0) //입력의 마지막줄인 경우
                break;
            int[][] map = new int[h][w];    //지도생성
            for (int i = 0; i < h; i++) {   //지도에 땅 1, 바다값 0 설정
                st = new StringTokenizer(br.readLine());
                for (int j = 0; j < w; j++) {
                    map[i][j] = Integer.parseInt(st.nextToken());
                }
            }
            int islandCnt = 0;
            boolean[][] isVisited = new boolean[h][w];
            for (int i = 0; i < h; i++) {
                for (int j = 0; j < w; j++) {
                    if (map[i][j] == 1 && isVisited[i][j] == false) {
                        islandCnt++;
                        dfs(j, i, isVisited, map);
                    }
                }
            }
            bw.write(islandCnt + "\n");
        }
        bw.flush();
        bw.close();
    }

    private static void dfs(int curX, int curY, boolean[][] isVisited, int[][] map) {
        isVisited[curY][curX] = true;
        for (int i = 0; i < 8; i++) {
            int nx = curX + dx[i];
            int ny = curY + dy[i];
            if (0 <= nx && nx < w && 0 <= ny && ny < h) {    //지도 범위 안일때
                if (map[ny][nx] == 1 && isVisited[ny][nx] == false)
                    dfs(nx, ny, isVisited, map);
            }
        }
    }
}
