package 프로그래머스.연습문제;

import java.util.LinkedList;
import java.util.Queue;

//Lv2 땅따먹기
class Solution {

    int solution(int[][] land) {
        int answer = 0;
        answer = downBfs(land);
        return answer;
    }

    private static int downBfs(int[][] land) {
        int max = 0;
        int h = land.length;
        int[][] dp = new int[h][4];
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{0, 0});
        queue.offer(new int[]{0, 1});
        queue.offer(new int[]{0, 2});
        queue.offer(new int[]{0, 3});
        dp[0][0] = land[0][0];
        dp[0][1] = land[0][1];
        dp[0][2] = land[0][2];
        dp[0][3] = land[0][3];

        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            for (int i = 0; i < 4; i++) {
                int nx = i;
                int ny = current[0] + 1;
                if (ny < h && nx != current[1]) { //최대 높이를 벗어나지 않고 같은 발판위치가 아니어야함
                    if (dp[ny][nx] < dp[current[0]][current[1]] + land[ny][nx]) {
                        dp[ny][nx] = dp[current[0]][current[1]] + land[ny][nx];
                        queue.offer(new int[]{ny, nx});
                    }
                }
            }
        }
        for (int i = 0; i < 4; i++) {
            max = Math.max(max, dp[h - 1][i]);
        }
        return max;
    }
}