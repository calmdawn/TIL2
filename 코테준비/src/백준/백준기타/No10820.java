package 백준.백준기타;

import java.io.*;

public class No10820 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int cnt = 0;

        while (true) {
            String input = br.readLine();
            if (input == null || input.isEmpty())
                break;
            int[] result = getResult(input);
            bw.write(result[0] + " " + result[1] + " " + result[2] + " " + result[3] + "\n");
        }
        bw.flush();
        bw.close();
    }

    private static int[] getResult(String input) {
        int[] result = new int[4];
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if ('a' <= ch && ch <= 'z') {
                result[0]++;
            } else if ('A' <= ch && ch <= 'Z') {
                result[1]++;
            } else if ('0' <= ch && ch <= '9') {
                result[2]++;
            } else if (ch == ' ') {
                result[3]++;
            }
        }
        return result;
    }
}