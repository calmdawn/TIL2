package 백준.단계별로풀어보기.Lv19_스택;

import java.io.*;
import java.util.Stack;
import java.util.StringTokenizer;

public class No3_9012 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());
        StringTokenizer st;
        Stack<Character> stack = new Stack<Character>();
        for (int testCase = 0; testCase < T; testCase++) {
            st = new StringTokenizer(br.readLine(),"()",true);
            boolean isCheck = true;
            while (st.hasMoreTokens()) {
                char ch = st.nextToken().charAt(0);
                if (ch == '(') {
                    stack.push(ch);
                } else if (ch == ')') {
                    if (stack.isEmpty()) {
                        isCheck = false;
                        break;
                    }
                    stack.pop();
                }
            }
            if (isCheck && stack.isEmpty())
                bw.write("YES\n");
            else
                bw.write("NO\n");
            stack.clear();
        }
        bw.flush();
        bw.close();
    }
}
