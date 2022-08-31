package 백준.단계별로풀어보기.Lv3_반복문;

import java.io.*;
import java.util.StringTokenizer;

public class No13_25304 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        int X = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine());
        int sum = 0;
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            sum = sum + (Integer.parseInt(st.nextToken()) * Integer.parseInt(st.nextToken()));
        }
        if (X == sum)
            bw.write("Yes");
        else
            bw.write("No");
        bw.flush();
        bw.close();
    }
}
