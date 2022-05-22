package 백준.기본수학1;

import java.io.*;
import java.util.StringTokenizer;

public class No2_2292 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int result = 1;
        int d = 6;
        int count = 1;

        while (result < N) {
            result = result + d * count;
            count++;
        }

        bw.write(String.valueOf(count));
        bw.flush();
        bw.close();
    }
}
