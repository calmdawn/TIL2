package 백준.알고리즘기초1_1;

import java.io.*;
import java.util.Arrays;

public class No1_1786 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String T = br.readLine();
        String P = br.readLine();
        int[] pi = new int[P.length()];

        setPi(pi, P);
        System.out.println(Arrays.toString(pi));
        runKMP(pi, T, P);

        bw.flush();
        bw.close();
    }

    private static void runKMP(int[] pi, String T, String P) {
        int j = 0;
        for (int i = 0; i < T.length(); i++) {
            if (j>0 && T.charAt(i) != P.charAt(j)){
                j= pi[j-1];
            }
            if(T.charAt(i) == P.charAt(j)){
                if(j == P.length()-1) {
                    System.out.println("발견");
                    j = pi[j];
                }else {
                    j++;
                }
            }
        }
    }

    private static void setPi(int[] pi, String P) {
        int preIdx = 0;
        int endIdx = 1;

        while (endIdx < P.length()) {
            if (P.charAt(preIdx) == P.charAt(endIdx)) {
                pi[endIdx] = pi[endIdx - 1] + 1;
                preIdx++;
            } else {
                preIdx = 0;
            }
            endIdx++;
        }
    }
}
