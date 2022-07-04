package 백준.Lv16_동적계획법1;

import java.io.*;
import java.util.StringTokenizer;

public class No6_1149 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int[][] houses = new int[N][3];
        StringTokenizer st = new StringTokenizer(br.readLine());
        houses[0][0] = Integer.parseInt(st.nextToken());
        houses[0][1] = Integer.parseInt(st.nextToken());
        houses[0][2] = Integer.parseInt(st.nextToken());

        for (int i = 1; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            houses[i][0] = Math.min(houses[i - 1][1], houses[i - 1][2]) + Integer.parseInt(st.nextToken());
            houses[i][1] = Math.min(houses[i - 1][0], houses[i - 1][2]) + Integer.parseInt(st.nextToken());
            houses[i][2] = Math.min(houses[i - 1][0], houses[i - 1][1]) + Integer.parseInt(st.nextToken());
        }

        bw.write(String.valueOf(Math.min(houses[N - 1][0], Math.min(houses[N - 1][1], houses[N - 1][2]))));
        bw.flush();
        bw.close();
    }
}
