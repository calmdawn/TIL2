package 백준.Lv7_기본수학1;

import java.io.*;
import java.util.StringTokenizer;

public class No4_2869 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int V = Integer.parseInt(st.nextToken());
        int day = 1;
        int len = A - B;    //하루에 올라가는 높이

        V = V - A;  // 마지막날 하루를 미리 계산함
        if (V % len == 0)
            day = day + V / len;
        else
            day = day + V / len + 1;
        bw.write(String.valueOf(day));
        bw.flush();
        bw.close();
    }
}
