package 백준.단계별로풀어보기.Lv12_집합과맵;

import java.io.*;
import java.util.HashMap;
import java.util.StringTokenizer;

public class No1_10815 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int[] cards = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        HashMap<Integer, Integer> savedCardHashMap = new HashMap<>();

        for (int i = 0; i < N; i++) {
            cards[i] = Integer.parseInt(st.nextToken());
            savedCardHashMap.put(cards[i], 1);
        }

        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < M; i++) {
            int num = Integer.parseInt(st.nextToken());
            if(savedCardHashMap.get(num) != null)
                bw.write(savedCardHashMap.get(num)+ " ");
            else
                bw.write("0 ");
        }

        bw.flush();
        bw.close();
    }
}
