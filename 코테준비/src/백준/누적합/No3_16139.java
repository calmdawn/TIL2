package 백준.누적합;

import java.io.*;
import java.util.StringTokenizer;

public class No3_16139 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String S = br.readLine();
        int q = Integer.parseInt(br.readLine());

        StringTokenizer st;
        for (int question = 0; question < q; question++) {
            st = new StringTokenizer(br.readLine());
            char ch = st.nextToken().charAt(0);
            int l = Integer.parseInt(st.nextToken());
            int r = Integer.parseInt(st.nextToken());
            int cnt = 0;
            for (int i = l; i <= r; i++) {
                if (S.charAt(i) == ch)
                    cnt++;
            }
            bw.write(cnt + "\n");
        }

        bw.flush();
        bw.close();
    }
}
