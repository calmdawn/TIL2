package 백준.Lv19_스택;

import java.io.*;
import java.util.Stack;
import java.util.StringTokenizer;

public class No2_10773 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int K = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();
        int sum = 0;
        for(int i =0; i<K; i++){
            int num = Integer.parseInt(br.readLine());

            if(num == 0)
                stack.pop();
            else
                stack.push(num);
        }
        while (!stack.isEmpty()){
            sum = sum + stack.pop();
        }

        bw.write(String.valueOf(sum));
        bw.flush();
        bw.close();
    }
}
