package 백준.알고리즘기초1_1;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class No7_1158 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        Queue<Integer> queue = new LinkedList<>();
        StringBuilder sb = new StringBuilder();
        int cnt = 1;
        for (int i = 1; i <= N; i++)
            queue.add(i);

        sb.append("<");
        while (!queue.isEmpty()) {
            if (queue.size() == 1) {
                sb.append(queue.poll()).append(">");
                break;
            }

            if (cnt == K) {
                sb.append(queue.poll()).append(", ");
                cnt = 1;
            } else {
                queue.add(queue.poll());
                cnt++;
            }
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}
