package 백준.배열1차원;

import java.io.*;
import java.util.StringTokenizer;

public class No5_1546 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());
        float[] scores = new float[N];
        st = new StringTokenizer(br.readLine(), " ");
        float max = 0;
        float sum = 0;

        for (int i = 0; i < N; i++) {
            scores[i] = Float.parseFloat(st.nextToken());
            max = Math.max(max, scores[i]);
        }

        for (int j = 0; j < N; j++) {
            scores[j] = scores[j] / max * 100;
            sum = sum + scores[j];
        }

        bw.write(String.valueOf((double) sum / N));
        bw.flush();
        bw.close();
    }
}
