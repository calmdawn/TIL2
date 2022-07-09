package 백준.단계별로풀어보기.Lv7_기본수학1;

import java.io.*;
import java.util.StringTokenizer;

public class No5_10250 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        int testCase = Integer.parseInt(br.readLine());

        for (int i = 0; i < testCase; i++) {
            st = new StringTokenizer(br.readLine());
            int H = Integer.parseInt(st.nextToken());   //호텔의 층수
            int W = Integer.parseInt(st.nextToken());   //각층의 방수
            int N = Integer.parseInt(st.nextToken());   //몇번째 손님인지

            int width = N / H;          //호수
            int height = N % H;        //층수

            if (N % H == 0) {           //호텔높이, 즉 최고층인경우
                height = H;
            } else {                    //최고층이아닌 경우 다음번호대 호수로 넘어감
                width = width + 1;
            }

            if (width < 10)             //호수가 10보다 작은경우 가운데 0을 붙여주어야함
                height = height * 10;
            sb.append(height).append(width).append("\n");
            bw.write(sb.toString());
            sb.setLength(0);
        }

        bw.flush();
        bw.close();
    }
}
