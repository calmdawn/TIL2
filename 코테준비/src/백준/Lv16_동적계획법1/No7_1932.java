package 백준.Lv16_동적계획법1;

import java.io.*;
import java.util.StringTokenizer;

public class No7_1932 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int[][] houses = new int[N][];
        StringTokenizer st;

        houses[0] = new int[1];
        houses[0][0] = Integer.parseInt(br.readLine());

        for (int i = 1; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            houses[i] = new int[i + 1];
            for (int j = 0; j <= i; j++) {
                if (j == 0)
                    houses[i][j] = houses[i - 1][j] + Integer.parseInt(st.nextToken());
                else if (j == i)
                    houses[i][j] = houses[i - 1][j - 1] + Integer.parseInt(st.nextToken());
                else
                    houses[i][j] = Integer.parseInt(st.nextToken()) + Math.max(houses[i - 1][j - 1], houses[i - 1][j]);
            }
        }

        int max = -1;
        for (int i = 0; i < houses[N - 1].length; i++)
            max = Math.max(max, houses[N - 1][i]);

        bw.write(String.valueOf(max));
        bw.flush();
        bw.close();
    }
}
