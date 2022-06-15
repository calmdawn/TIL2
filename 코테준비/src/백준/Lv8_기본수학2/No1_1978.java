package 백준.Lv8_기본수학2;

import java.io.*;
import java.util.StringTokenizer;

public class No1_1978 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int count = 0;

        while (st.hasMoreTokens()) {
            int num = Integer.parseInt(st.nextToken());

            if (num == 2)
                count++;
            else if (num > 2 && num % 2 != 0) {
                int temp = (int) Math.sqrt(num);
                count++;
                for (int i = 2; i <= temp; i++) {
                    if (num % i == 0) {
                        count--;
                        break;
                    }
                }
            }
        }

        bw.write(String.valueOf(count));
        bw.flush();
        bw.close();
    }
}
