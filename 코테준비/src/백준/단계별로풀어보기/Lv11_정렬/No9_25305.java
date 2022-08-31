package 백준.단계별로풀어보기.Lv11_정렬;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class No9_25305 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int[] scores = new int[N];
        for (int i = 0; i < N; i++)
            scores[i] = Integer.parseInt(st.nextToken());
        Arrays.sort(scores);
        bw.write(String.valueOf(scores[N - k]));
        bw.flush();
        bw.close();
    }
}
