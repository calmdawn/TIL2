package 백준.브루트포스;

import java.io.*;
import java.util.StringTokenizer;

public class No4_1018 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        String blackStart = "BWBWBWBWWBWBWBWBBWBWBWBWWBWBWBWBBWBWBWBWWBWBWBWBBWBWBWBWWBWBWBWB";
        String whiteStart = "WBWBWBWBBWBWBWBWWBWBWBWBBWBWBWBWWBWBWBWBBWBWBWBWWBWBWBWBBWBWBWBW";
        String[] square = new String[N];
        int min = 64;

        for (int i = 0; i < N; i++)
            square[i] = br.readLine();


        //8 * 8 체스판 잘라내기
        for (int i = 0; i <= N - 8; i++) {
            for (int j = 0; j <= M - 8; j++) {
                min = Math.min(min, getMinSquare(blackStart, whiteStart, createChess(i, j, square)));
            }
        }

        bw.write(String.valueOf(min));

        bw.flush();
        bw.close();
    }

    private static int getMinSquare(String blackStart, String whiteStart, String chess) {
        int blackCount = 0;
        int whiteCount = 0;

        for (int i = 0; i < 64; i++) {
            if (blackStart.charAt(i) != chess.charAt(i))
                blackCount++;
            if (whiteStart.charAt(i) != chess.charAt(i))
                whiteCount++;
        }
        return Math.min(blackCount, whiteCount);
    }

    private static String createChess(int i, int j, String[] square) {
        StringBuilder sb = new StringBuilder();

        for (int y = i; y < i + 8; y++)
            sb.append(square[y], j, j + 8);

        return sb.toString();
    }

}
