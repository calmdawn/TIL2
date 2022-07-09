package 백준.단계별로풀어보기.Lv20_큐_덱;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;

public class No2_2164 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        Queue<Integer> queue = new LinkedList<>();
        int lastCard = 0;

        for (int i = 1; i <= N; i++)
            queue.add(i);

        while (!queue.isEmpty()) {
            lastCard = queue.poll();
            if(queue.isEmpty())
                break;
            queue.add(queue.poll());
        }

        bw.write(String.valueOf(lastCard));
        bw.flush();
        bw.close();
    }
}
