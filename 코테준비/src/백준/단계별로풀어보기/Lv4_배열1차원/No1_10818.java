package 백준.단계별로풀어보기.Lv4_배열1차원;

import java.io.*;
import java.util.StringTokenizer;


public class No1_10818 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int max = -1000001;
        int min = 1000001;
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        while (st.hasMoreTokens()) {
            int num = Integer.parseInt(st.nextToken());
            if (max < num)
                max = num;
            if (min > num)
                min = num;
        }
        bw.write(min + " " + max);
        bw.flush();
        bw.close();
    }
}
