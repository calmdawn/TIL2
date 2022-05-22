package 백준.문자열;

import java.io.*;

public class No7_2908 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] numbers = br.readLine().split(" ");
        StringBuilder sb = new StringBuilder();
        int A = 0, B = 0;

        //첫번째 세자리 수 거꾸로 설정해서 A에 넣기
        sb.append(numbers[0]);
        A = Integer.parseInt(sb.reverse().toString());

        //StringBuilder clear 과정
        sb.setLength(0);

        //두번째 세자리 수 거꾸로 설정해서 B에 넣기
        sb.append(numbers[1]);
        B = Integer.parseInt(sb.reverse().toString());

        bw.write(String.valueOf(Math.max(A, B)));
        bw.flush();
        bw.close();
    }
}
