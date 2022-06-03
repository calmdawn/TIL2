package 백준.집합과맵;

import java.io.*;
import java.util.HashMap;
import java.util.StringTokenizer;

public class No4_10816 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        int M;
        HashMap<Integer, Integer> cardHashMap = new HashMap<>();

        while (st.hasMoreTokens()) {
            int card = Integer.parseInt(st.nextToken());
            cardHashMap.put(card, cardHashMap.getOrDefault(card, 0) + 1);
        }

        M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        while (st.hasMoreTokens())
            bw.write(cardHashMap.getOrDefault(Integer.parseInt(st.nextToken()), 0) + " ");

        bw.flush();
        bw.close();
    }
}
