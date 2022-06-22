package 백준.Lv20_큐_덱;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class No3_11866 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        Queue<Integer> queue = new LinkedList<>();
        StringBuilder sb = new StringBuilder();

        for (int i = 1; i <= N; i++)
            queue.add(i);

        sb.append("<");
        int turn = 1;

        while (!queue.isEmpty()) {
            if (turn == K) {
                int n = queue.poll();
                if (queue.isEmpty())
                    sb.append(n).append(">");
                else {
                    sb.append(n).append(", ");
                    turn = 1;
                }
            } else {
                queue.add(queue.poll());
                turn++;
            }
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}
