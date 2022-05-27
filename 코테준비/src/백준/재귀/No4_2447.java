package 백준.재귀;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No4_2447 {

    static char[][] square;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        square = new char[N][N];


        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++)
                square[i][j] = '*';
        }

        int startIdx = N / 3;

        for (char[] stars : square) {
            for (char star : stars)
                System.out.print(String.valueOf(star));
            System.out.println();
        }

    }

}
