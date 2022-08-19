package 백준.백준기타;

import java.io.*;
import java.util.Stack;
import java.util.StringTokenizer;

public class No11576 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        int sum = 0;
        for (int i = 0; i < m; i++) //A진법을 10진법으로
            sum = sum * A + Integer.parseInt(st.nextToken());
        String result = getBase(sum, B);
        bw.write(result);
        bw.flush();
        bw.close();
    }

    private static String getBase(int sum, int B) {
        Stack<Integer> stack = new Stack<>();
        StringBuffer result = new StringBuffer();
        if (sum == 0)
            return "0";
        while (sum > 0) {
            stack.push(sum % B);
            sum = sum / B;
        }
        while (!stack.isEmpty())
            result.append(stack.pop()).append(" ");
        return result.toString().trim();
    }
}
