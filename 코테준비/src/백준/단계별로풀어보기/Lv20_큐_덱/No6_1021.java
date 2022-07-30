package 백준.단계별로풀어보기.Lv20_큐_덱;

import java.io.*;
import java.util.*;

public class No6_1021 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Deque<Integer> deque = new LinkedList<>();

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[] locate = new int[M];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < M; i++)
            locate[i] = Integer.parseInt(st.nextToken());

        for (int i = 1; i <= N; i++)
            deque.offer(i);

        int mov = 0;
        int result = 0;
        for (int idx = 0; idx < M; idx++) {

            while (deque.peek() != locate[idx]) {
                mov++;
                deque.offerLast(deque.pollFirst());
            }

            if (mov > deque.size() / 2) {
                while (mov != 0) {    //원위치로
                    deque.offerFirst(deque.pollLast());
                    mov--;
                }

                while (deque.peek() != locate[idx]) {
                    mov++;
                    deque.offerFirst(deque.pollLast());
                }
            }
            result = result + mov;
            mov = 0;
            deque.poll();
        }

        bw.write(String.valueOf(result));
        bw.flush();
        bw.close();
    }
}
