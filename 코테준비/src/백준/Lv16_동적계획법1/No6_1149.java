package 백준.Lv16_동적계획법1;

import java.io.*;
import java.util.StringTokenizer;

public class No6_1149 {
    private static int N;
    private static int min = 1000001;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        N = Integer.parseInt(br.readLine());
        int[][] costs = new int[N][3];
        StringTokenizer st;

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 3; j++) {
                costs[i][j] = Integer.parseInt(st.nextToken());
            }
        }


        calculateCost(costs, 1, 0, costs[0][0]);
        calculateCost(costs, 1, 1, costs[0][1]);
        calculateCost(costs, 1, 2, costs[0][2]);

        bw.write(String.valueOf(min));
        bw.flush();
        bw.close();
    }

    private static void calculateCost(int[][] costs, int depth, int col, int sum) {
        if (depth == N) {
            min = Math.min(min, sum);
            return;
        }
        for (int i = 0; i < 3; i++) {
            if (i != col) {
                calculateCost(costs, depth + 1, i, sum + costs[depth][i]);
            }
        }
    }
}
