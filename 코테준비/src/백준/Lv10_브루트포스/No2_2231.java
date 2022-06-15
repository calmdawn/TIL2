package 백준.Lv10_브루트포스;

import java.io.*;

public class No2_2231 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int min = 1000001;

        for (int i = 1; i < N; i++) {
            int constructor = getConstructor(i);
            if (constructor == N)
                min = Math.min(min, i);
        }

        if (min != 1000001)
            bw.write(String.valueOf(min));
        else
            bw.write("0");
        bw.flush();
        bw.close();
    }

    private static int getConstructor(int num) {
        int constructor = num;
        while (num > 0) {
            constructor = constructor + num % 10;
            num = num / 10;
        }
        return constructor;
    }
}
