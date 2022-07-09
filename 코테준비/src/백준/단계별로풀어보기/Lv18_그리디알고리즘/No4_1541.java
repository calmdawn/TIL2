package 백준.단계별로풀어보기.Lv18_그리디알고리즘;

import java.io.*;
import java.util.StringTokenizer;

public class No4_1541 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine(), "-+", true);

        int answer = Integer.parseInt(st.nextToken());
        boolean isOper = true;

        while (st.hasMoreTokens()) {
            String str = st.nextToken();
            if (str.equals("+")) {

            } else if (str.equals("-")) {
                isOper = false;
            } else {
                if (isOper == false)
                    answer = answer - Integer.parseInt(str);
                else
                    answer = answer + Integer.parseInt(str);
            }
        }
        bw.write(String.valueOf(answer));
        bw.flush();
        bw.close();
    }
}
