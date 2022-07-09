package 백준.단계별로풀어보기.Lv20_큐_덱;

import java.io.*;
import java.util.*;

public class No5_1021 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Deque<Integer> deque = new LinkedList<>();
        Deque<Integer> tempDeque = new LinkedList<>();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[] locate = new int[M];
        st = new StringTokenizer(br.readLine());

        for (int i = 1; i <=N ; i++)
            deque.add(i);
        tempDeque = deque;
        tempDeque.pop();

        System.out.println(deque.peek());
        System.out.println(tempDeque.peek());
        for (int i = 0; i < M; i++)
            locate[i] = Integer.parseInt(st.nextToken());




        bw.flush();
        bw.close();
    }
}
