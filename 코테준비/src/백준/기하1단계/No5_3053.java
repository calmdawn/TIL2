package 백준.기하1단계;

import java.io.*;
import java.util.StringTokenizer;

public class No5_3053 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int R = Integer.parseInt(br.readLine());
        double uArea = R * R * Math.PI;
        double tArea = 2 * R * R;

        bw.write(String.format("%.6f", uArea) + "\n");
        bw.write(String.format("%.6f", tArea) + "\n");
        bw.flush();
        bw.close();

    }
}
