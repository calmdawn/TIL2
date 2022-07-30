package 백준.단계별로풀어보기.Lv20_큐_덱;

import java.io.*;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class No7_5430 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Deque<String> deque = new LinkedList<>();
        int T = Integer.parseInt(br.readLine());
        StringTokenizer st;
        StringBuffer sb = new StringBuffer();
        for (int testCase = 0; testCase < T; testCase++) {
            String p = br.readLine();
            int delCnt = getDeleteCnt(p);
            int n = Integer.parseInt(br.readLine());
            st = new StringTokenizer(br.readLine(), "[,]");

            while (st.hasMoreTokens())
                deque.offer(st.nextToken());

            if (delCnt > n) {
                bw.write("error\n");
            } else {
                boolean flag = runCommand(p, deque);
                bw.write(printDeque(flag, deque, sb));
            }
            sb.setLength(0);
            deque.clear();
        }
        bw.flush();
        bw.close();
    }

    private static String printDeque(boolean flag, Deque<String> deque, StringBuffer sb) {
        if (flag) {
            sb.append("[");
            if (deque.size() > 0) {
                sb.append(deque.pollFirst());
                while (!deque.isEmpty()) {
                    sb.append("," + deque.pollFirst());
                }
            }
            sb.append("]").append("\n");
        } else {
            sb.append("[");
            if (deque.size() > 0) {
                sb.append(deque.pollLast());
                while (!deque.isEmpty()) {
                    sb.append("," + deque.pollLast());
                }
            }
            sb.append("]").append("\n");
        }
        return sb.toString();
    }

    private static boolean runCommand(String p, Deque<String> deque) {
        boolean flag = true;
        for (int i = 0; i < p.length(); i++) {
            char command = p.charAt(i);
            if (command == 'R') {
                flag = !flag;
            } else {
                if (flag) {
                    deque.pollFirst();
                } else {
                    deque.pollLast();
                }
            }
        }
        return flag;
    }

    private static int getDeleteCnt(String p) {
        int cnt = 0;
        for (int i = 0; i < p.length(); i++) {
            if (p.charAt(i) == 'D')
                cnt++;
        }
        return cnt;
    }
}
