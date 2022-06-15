package 백준.Lv13_기하1;

import java.io.*;
import java.util.StringTokenizer;

public class No3_4153 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st;

        while (true) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            if (a == 0 && b == 0 && c == 0)
                break;

            if (a <= b && b <= c)
                bw.write(checkCase(a, b, c) + "\n");
            else if (a <= c && c <= b)
                bw.write(checkCase(a, c, b) + "\n");
            else
                bw.write(checkCase(b, c, a) + "\n");
        }

        bw.flush();
        bw.close();
    }

    private static String checkCase(int a, int b, int c) {
        if (Math.pow(c, 2) == Math.pow(a, 2) + Math.pow(b, 2))
            return "right";
        else
            return "wrong";
    }
}
