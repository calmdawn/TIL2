package 백준.백준기타;

import java.io.*;
import java.util.Collections;
import java.util.HashMap;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class No11004 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        PriorityQueue<Integer> minHeap = new PriorityQueue<>(); //최소 힙
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            minHeap.add(Integer.valueOf(st.nextToken()));
        }
        while (K > 1) {
            minHeap.poll();
            K--;
        }
        bw.write(String.valueOf(minHeap.poll()));
        bw.flush();
        bw.close();
    }
}