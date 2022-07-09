package 백준.단계별로풀어보기.Lv11_정렬;

import java.io.*;
import java.util.Arrays;
import java.util.Comparator;

public class No6_1181 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        String[] words = new String[N];
        String prevWord;

        for (int i = 0; i < N; i++)
            words[i] = br.readLine();

        Arrays.sort(words, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.length() == o2.length())
                    return o1.compareTo(o2);
                return o1.length() - o2.length();
            }
        });

        prevWord = words[0];
        for (int i = 1; i < N; i++) {
            if (!prevWord.equals(words[i])) {
                bw.write(prevWord + "\n");
                prevWord = words[i];
            }
        }

        bw.write(prevWord);
        bw.flush();
        bw.close();
    }
}
