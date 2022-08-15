package 백준.백준기타;

import java.io.*;
import java.util.*;

public class No10845 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        Deque<Integer> queue = new LinkedList<>();
        StringTokenizer st;
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            String command = st.nextToken();
            if (command.equals("push")) {
                queue.offer(Integer.valueOf(st.nextToken()));
                continue;
            } else if (command.equals("pop")) {
                if (queue.isEmpty())
                    bw.write("-1");
                else
                    bw.write(String.valueOf(queue.poll()));
            } else if (command.equals("size")) {
                bw.write(String.valueOf(queue.size()));
            } else if (command.equals("empty")) {
                if (queue.isEmpty())
                    bw.write("1");
                else
                    bw.write("0");
            } else if (command.equals("front")) {
                if (queue.isEmpty())
                    bw.write("-1");
                else
                    bw.write(String.valueOf(queue.peek()));
            } else if (command.equals("back")) {
                if (queue.isEmpty())
                    bw.write("-1");
                else
                    bw.write(String.valueOf(queue.peekLast()));
            }
            bw.write("\n");
        }
        bw.flush();
        bw.close();
    }
}