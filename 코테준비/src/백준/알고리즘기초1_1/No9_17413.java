package 백준.알고리즘기초1_1;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.StringTokenizer;

public class No9_17413 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine(), "<> ", true);
        StringBuffer resultSb = new StringBuffer();
        StringBuffer tempSb = new StringBuffer();

        while (st.hasMoreTokens()) {
            String str = st.nextToken();
            if (str.equals("<")) {
                while (!str.equals(">")) {
                    resultSb.append(str);
                    str = st.nextToken();
                }
                resultSb.append(str);
            } else {
                tempSb.append(str);
                resultSb.append(tempSb.reverse());
                tempSb.setLength(0);
            }
        }

        bw.write(resultSb.toString());
        bw.flush();
        bw.close();
    }
}
