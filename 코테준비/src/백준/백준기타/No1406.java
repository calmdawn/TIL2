package 백준.백준기타;

import java.io.*;
import java.util.Stack;
import java.util.StringTokenizer;

public class No1406 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        Stack<Character> beforeStack = new Stack<>();
        Stack<Character> afterStack = new Stack<>();
        String input = br.readLine();
        for (int i = 0; i < input.length(); i++)//초기 문자열 추가
            beforeStack.push(input.charAt(i));

        int M = Integer.parseInt(br.readLine());
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            char cmd = st.nextToken().charAt(0);
            if (cmd == 'L') {
                if (!beforeStack.isEmpty())
                    afterStack.push(beforeStack.pop());
            } else if (cmd == 'D') {
                if (!afterStack.isEmpty())
                    beforeStack.push(afterStack.pop());
            } else if (cmd == 'B') {
                if (!beforeStack.isEmpty())
                    beforeStack.pop();
            } else if (cmd == 'P') {
                beforeStack.push(st.nextToken().charAt(0));
            }
        }
        while (!beforeStack.isEmpty())
            afterStack.push(beforeStack.pop());
        while (!afterStack.isEmpty())
            bw.write(afterStack.pop());
        bw.flush();
        bw.close();
    }
}
