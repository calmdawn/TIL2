package 백준.Lv19_스택;

import java.io.*;
import java.util.Stack;

public class No5_1874 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Stack<Integer> stack = new Stack<Integer>();
        int n = Integer.parseInt(br.readLine());
        int start = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= start; i++) {
            stack.push(i);
            sb.append("+\n");
        }
        stack.pop();
        sb.append("-\n");

        for (int i = 1; i < n; i++) {
            int num = Integer.parseInt(br.readLine());


            if ((stack.isEmpty() && start < num) || (stack.peek() < num && start < num)) {
                for (int j = start + 1; j <= num; j++) {
                    stack.push(j);
                    sb.append("+\n");
                }
                start = stack.pop();
                sb.append("-\n");
            } else if (stack.peek() == num) {
                stack.pop();
                sb.append("-\n");
            } else {
                sb.setLength(0);
                sb.append("NO");
                break;
            }
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}
