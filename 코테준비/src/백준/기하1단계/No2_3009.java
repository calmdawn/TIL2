package 백준.기하1단계;

import java.io.*;
import java.util.StringTokenizer;

public class No2_3009 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st;
        int x1, x2, x3, x4;
        int y1, y2, y3, y4;
        st = new StringTokenizer(br.readLine());
        x1 = Integer.parseInt(st.nextToken());
        y1 = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        x2 = Integer.parseInt(st.nextToken());
        y2 = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        x3 = Integer.parseInt(st.nextToken());
        y3 = Integer.parseInt(st.nextToken());

        if(x1 == x2)
            x4 = x3;
        else if(x1 == x3)
            x4 = x2;
        else
            x4 = x1;

        if(y1 == y2)
            y4 = y3;
        else if(y1 == y3)
            y4 = y2;
        else
            y4 = y1;

        bw.write(x4 + " " + y4);
        bw.flush();
        bw.close();
    }
}
