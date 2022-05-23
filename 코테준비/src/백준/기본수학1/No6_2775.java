package 백준.기본수학1;

import java.io.*;
import java.util.StringTokenizer;

public class No6_2775 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int testCase = Integer.parseInt(br.readLine());

        int[][] apart = new int[15][15];    //아파트 입주민 수 미리 구하기

        for (int i = 0; i < 15; i++)    // 0층 입주민 수 세팅
            apart[0][i] = i;

        //k층 n호 = k층 (n-1)호 + (k-1)층 n호
        for (int height = 1; height < 15; height++) {
            for (int width = 1; width < 15; width++) {
                apart[height][width] = apart[height][width - 1] + apart[height - 1][width];
            }
        }

        for (int i = 0; i < testCase; i++) {
            int k = Integer.parseInt(br.readLine());    //아파트 층수
            int n = Integer.parseInt(br.readLine());    //아파트 호수
            bw.write(apart[k][n] + "\n");   //미리구했던 아파트 입주민수 출력
        }

        bw.flush();
        bw.close();
    }
}
