package 백준.Lv6_문자열;

import java.io.*;
import java.util.StringTokenizer;

public class No4_2675 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st;
        StringBuilder sb;
        int T = Integer.parseInt(br.readLine());

        while (T-- > 0) {
            st = new StringTokenizer(br.readLine(), " ");
            sb = new StringBuilder();
            int R = Integer.parseInt(st.nextToken());
            String S = st.nextToken();

            for (int i = 0; i < S.length(); i++) {
                for (int j = 0; j < R; j++)
                    sb.append(S.charAt(i));
            }
            bw.write(sb.toString());
            bw.newLine();
        }

        bw.flush();
        bw.close();
    }
}
