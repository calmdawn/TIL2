package 백준.단계별로풀어보기.Lv14_정수론및조합론;

import java.io.*;
import java.util.HashMap;

public class No10_9375 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());

        for (int testCase = 0; testCase < T; testCase++) {
            int n = Integer.parseInt(br.readLine());
            HashMap<String, Integer> clothesType = new HashMap<>();
            for (int i = 0; i < n; i++) {
                String[] input = br.readLine().split(" ");
                clothesType.put(input[1], clothesType.getOrDefault(input[1], 0) + 1);
            }
            long result = 1;
            for (int val : clothesType.values())
                result = result * (val + 1);
            bw.write((result - 1) + "\n");
        }

        bw.flush();
        bw.close();
    }
}