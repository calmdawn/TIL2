package 백준.Lv14_정수론및조합론;

import java.io.*;
import java.util.StringTokenizer;

public class No1_5086 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n1, n2;
        StringTokenizer st;

        while (true) {
            st = new StringTokenizer(br.readLine());
            n1 = Integer.parseInt(st.nextToken());
            n2 = Integer.parseInt(st.nextToken());

            if (n1 == 0 && n2 == 0)
                break;

            if (n2 % n1 == 0)
                bw.write("factor\n");
            else if (n1 % n2 == 0)
                bw.write("multiple\n");
            else
                bw.write("neither\n");
        }
        bw.flush();
        bw.close();
    }
}
