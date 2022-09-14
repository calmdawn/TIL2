package 프로그래머스.깊이_너비우선탐색;
//Lv2 게임 맵 최단거리

import java.util.LinkedList;
import java.util.Queue;

class Solution2 {
    private static int[] dx = {0, 0, -1, 1}; // 상하좌우
    private static int[] dy = {-1, 1, 0, 0};
    private static int n, m;

    public int solution(int[][] maps) {
        int answer = 0;
        n = maps.length;
        m = maps[0].length;
        boolean[][] isVisited = new boolean[n][m];
        answer = bfs(maps, isVisited, 0, 0);
        return answer;
    }

    private int bfs(int[][] maps, boolean[][] isVisited, int sX, int sY) {
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{sY, sX, 1});
        isVisited[sY][sX] = true;
        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            for (int i = 0; i < 4; i++) {
                int ny = current[0] + dy[i];
                int nx = current[1] + dx[i];
                if (ny == n - 1 && nx == m - 1)
                    return current[2] + 1;
                if (0 <= nx && nx < m && 0 <= ny && ny < n
                        && maps[ny][nx] == 1 && isVisited[ny][nx] == false) {
                    queue.offer(new int[]{ny, nx, current[2] + 1});
                    isVisited[ny][nx] = true;
                }
            }
        }
        return -1;
    }
}
