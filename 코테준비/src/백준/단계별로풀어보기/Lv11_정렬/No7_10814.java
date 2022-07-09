package 백준.단계별로풀어보기.Lv11_정렬;

import java.io.*;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class No7_10814 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        String[][] personInfos = new String[N][3];
        StringTokenizer st;

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            personInfos[i][0] = String.valueOf(i);  //가입순서
            personInfos[i][1] = st.nextToken();     //나이
            personInfos[i][2] = st.nextToken();     //이름
        }

        Arrays.sort(personInfos, new Comparator<String[]>() {
            @Override
            public int compare(String[] o1, String[] o2) {
                return Integer.parseInt(o1[1]) - Integer.parseInt(o2[1]);
            }
        });

        for (int j = 0; j < N; j++)
            bw.write(personInfos[j][1] + " " + personInfos[j][2] + "\n");

        bw.flush();
        bw.close();
    }
}
