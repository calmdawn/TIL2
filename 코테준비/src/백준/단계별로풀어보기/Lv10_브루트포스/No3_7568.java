package 백준.단계별로풀어보기.Lv10_브루트포스;

import java.io.*;
import java.util.StringTokenizer;

public class No3_7568 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        int[][] persons = new int[N][2];
        StringTokenizer st;

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            persons[i][0] = Integer.parseInt(st.nextToken());
            persons[i][1] = Integer.parseInt(st.nextToken());
        }

        for (int j = 0; j < N; j++) {
            int rank = 1;
            for (int k = 0; k < N; k++) {
                if (persons[j][0] < persons[k][0] && persons[j][1] < persons[k][1])
                    rank++;
            }
            bw.write(rank + " ");
        }

        bw.flush();
        bw.close();
    }
}
