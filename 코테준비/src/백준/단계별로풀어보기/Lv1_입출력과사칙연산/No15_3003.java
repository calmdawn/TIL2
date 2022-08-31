package 백준.단계별로풀어보기.Lv1_입출력과사칙연산;

import java.io.*;
import java.util.StringTokenizer;

public class No15_3003 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] pieces = {1, 1, 2, 2, 2, 8};
        for (int i = 0; i < 6; i++)
            bw.write((pieces[i] - Integer.parseInt(st.nextToken())) + " ");
        bw.flush();
        bw.close();
    }
}
