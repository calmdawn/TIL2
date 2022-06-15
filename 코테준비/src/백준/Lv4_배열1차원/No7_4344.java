package 백준.Lv4_배열1차원;

import java.io.*;
import java.util.StringTokenizer;

public class No7_4344 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int C = Integer.parseInt(br.readLine());
        StringTokenizer st;

        for (int i = 0; i < C; i++) {
            st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int[] students = new int[N];
            double avg = 0;
            int upAvgCnt = 0;
            double rate = 0;

            for (int j = 0; j < N; j++) {
                students[j] = Integer.parseInt(st.nextToken());
                avg = avg + students[j];
            }
            avg = avg / N;

            for (int student : students) {
                if (student > avg)
                    upAvgCnt++;
            }
            rate = (double) upAvgCnt / N * 100;
            bw.write(String.format("%.3f", rate) + "%\n");
        }

        bw.flush();
        bw.close();
    }
}
