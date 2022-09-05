package 백준.단계별로풀어보기.Lv19_스택;

import java.io.*;
import java.util.Arrays;
import java.util.Stack;
import java.util.StringTokenizer;

public class No6_17298 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int[] numbers = new int[N];
        int[] result = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++)
            numbers[i] = Integer.parseInt(st.nextToken());
        Arrays.fill(result, -1);
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < N; i++) {
            if (stack.isEmpty()) {
                stack.push(i);
            } else {
                if (numbers[stack.peek()] < numbers[i]) {
                    result[stack.pop()] = numbers[i];
                    i--;
                } else {
                    stack.push(i);
                }
            }
        }
        for (int i = 0; i < N; i++)
            bw.write(result[i] + " ");
        bw.flush();
        bw.close();
    }
}
