package 백준.Lv19_스택;

import java.io.*;
import java.util.Stack;
import java.util.StringTokenizer;

public class No4_4949 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Stack<Character> stack = new Stack<Character>();
        while (true) {
            String str = br.readLine();
            boolean isCheck = true;

            if (str.equals("."))
                break;

            for (int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);
                if (ch == '(' || ch == '[')
                    stack.push(ch);
                else if (ch == ')') {
                    if (stack.isEmpty() || stack.pop() != '(') {
                        isCheck = false;
                        break;
                    }
                } else if (ch == ']') {
                    if (stack.isEmpty() || stack.pop() != '[') {
                        isCheck = false;
                        break;
                    }
                }
            }
            if (isCheck == true && stack.isEmpty())
                bw.write("yes\n");
            else
                bw.write("no\n");
            stack.clear();
        }
        bw.flush();
        bw.close();
    }
}
