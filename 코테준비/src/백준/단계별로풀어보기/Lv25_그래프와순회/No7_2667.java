package 백준.단계별로풀어보기.Lv25_그래프와순회;

import java.io.*;
import java.util.*;

public class No7_2667 {
    private static int N;
    private static int cnt = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        N = Integer.parseInt(br.readLine());
        int[][] square = new int[N][N];
        for (int i = 0; i < N; i++) {
            String input = br.readLine();
            for (int j = 0; j < N; j++) {
                square[i][j] = input.charAt(j) - '0';
            }
        }
        ArrayList<Integer> resultList = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                search(i, j, square);
                if (cnt > 0) {
                    resultList.add(cnt);
                    cnt = 0;
                }
            }
        }
        Collections.sort(resultList);

        bw.write(resultList.size() + "\n");
        for (int num : resultList)
            bw.write(num + "\n");
        bw.flush();
        bw.close();
    }

    private static void search(int i, int j, int[][] square) {
        if (i < 0 || i >= N || j < 0 || j >= N)
            return;
        if (square[i][j] == 0)
            return;
        square[i][j] = 0;
        search(i - 1, j, square);  //up 탐색
        search(i + 1, j, square);  //down 탐색
        search(i, j - 1, square);  //left 탐색
        search(i, j + 1, square);  //right 탐색
        cnt++;
    }
}
