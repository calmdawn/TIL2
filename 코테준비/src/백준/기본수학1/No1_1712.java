package 백준.기본수학1;

import java.io.*;
import java.util.StringTokenizer;

public class No1_1712 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());

        int cost = C - B;
        int result = 0;

        if (cost <= 0)
            result = -1;
        else {
            result = A / cost + 1;
        }

        bw.write(String.valueOf(result));
        bw.flush();
        bw.close();
    }
}
