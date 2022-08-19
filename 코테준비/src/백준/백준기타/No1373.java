package 백준.백준기타;

import java.io.*;

public class No1373 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String n = br.readLine();
        if (n.length() % 3 != 0) {  //세글자씩 나누어 떨어지지 않는 경우 앞에 0추가
            int k = 3 - n.length() % 3;
            while (k > 0) {
                n = "0" + n;
                k--;
            }
        }
        String result = getResult(n);
        bw.write(result);
        bw.flush();
        bw.close();
    }

    private static String getResult(String n) {
        StringBuffer sb = new StringBuffer();
        int sum = 0;
        for (int i = 0; i < n.length(); i++) {
            if (n.charAt(i) == '1') {
                if (i % 3 == 0)
                    sum = sum + 4;
                else if (i % 3 == 1) {
                    sum = sum + 2;
                } else {
                    sum = sum + 1;
                }
            }
            if (i % 3 == 2) {
                sb.append(sum);
                sum = 0;
            }
        }
        return sb.toString();
    }
}
