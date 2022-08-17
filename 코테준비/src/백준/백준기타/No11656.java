package 백준.백준기타;

import java.io.*;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public class No11656 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String input = br.readLine();
        List<String> list = new ArrayList<>();
        for (int i = 0; i < input.length(); i++)
            list.add(input.substring(i));
        Collections.sort(list);
        for (int i = 0; i < list.size(); i++)
            bw.write(list.get(i) + "\n");
        bw.flush();
        bw.close();
    }
}
