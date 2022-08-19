package 백준.백준기타;

import java.io.*;

public class No1212 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String base8 = br.readLine();
        String result = getBase2(base8);
        bw.write(result);
        bw.flush();
        bw.close();
    }

    private static String getBase2(String base8) {
        String[] table = {"000", "001", "010", "011", "100", "101", "110", "111"};
        StringBuffer base2 = new StringBuffer();
        base2.append(Integer.parseInt(table[base8.charAt(0) - '0']));
        for (int i = 1; i < base8.length(); i++) {
            base2.append(table[base8.charAt(i) - '0']);
        }
        return base2.toString();
    }
}
