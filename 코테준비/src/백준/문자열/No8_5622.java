package 백준.문자열;

import java.io.*;

public class No8_5622 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String word = br.readLine();
        int minTime = 0;
        for (int i = 0; i < word.length(); i++) {
            minTime = minTime + dial(word.charAt(i));
        }
        bw.write(String.valueOf(minTime));
        bw.flush();
        bw.close();
    }

    public static int dial(char alpha) {
        int time = 2;

        if ('A' <= alpha && alpha <= 'C') {
            time++;
        } else if ('D' <= alpha && alpha <= 'F') {
            time += 2;
        } else if ('G' <= alpha && alpha <= 'I') {
            time += 3;
        } else if ('J' <= alpha && alpha <= 'L') {
            time += 4;
        } else if ('M' <= alpha && alpha <= 'O') {
            time += 5;
        } else if ('P' <= alpha && alpha <= 'S') {
            time += 6;
        } else if ('T' <= alpha && alpha <= 'V') {
            time += 7;
        } else if ('W' <= alpha && alpha <= 'Z') {
            time += 8;
        }
        return time;
    }
}
