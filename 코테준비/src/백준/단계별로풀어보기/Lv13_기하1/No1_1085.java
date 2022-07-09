package 백준.단계별로풀어보기.Lv13_기하1;

import java.io.*;
import java.util.StringTokenizer;

public class No1_1085 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        int w = Integer.parseInt(st.nextToken());
        int h = Integer.parseInt(st.nextToken());

        int min = 1000;
        min = Math.min(min, x);
        min = Math.min(min, y);
        min = Math.min(min, w-x);
        min = Math.min(min, h-y);

        bw.write(String.valueOf(min));
        bw.flush();
        bw.close();
    }
}
