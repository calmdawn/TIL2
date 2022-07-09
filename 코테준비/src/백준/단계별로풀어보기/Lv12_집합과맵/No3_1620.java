package 백준.단계별로풀어보기.Lv12_집합과맵;

import java.io.*;
import java.util.HashMap;
import java.util.StringTokenizer;

public class No3_1620 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        HashMap<String, Integer> pokemonNameMap = new HashMap<>();
        HashMap<Integer, String> pokemonNumMap = new HashMap<>();
        for (int num = 1; num <= N; num++) {
            String name = br.readLine();
            pokemonNameMap.put(name, num);
            pokemonNumMap.put(num, name);
        }

        for (int i = 0; i < M; i++) {
            String input = br.readLine();
            if (pokemonNameMap.get(input) != null)
                bw.write(pokemonNameMap.get(input) + "\n");
            else
                bw.write(pokemonNumMap.get(Integer.parseInt(input)) + "\n");
        }

        bw.flush();
        bw.close();
    }
}
