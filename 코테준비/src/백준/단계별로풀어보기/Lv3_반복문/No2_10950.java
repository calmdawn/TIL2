package 백준.단계별로풀어보기.Lv3_반복문;

import java.util.Scanner;

public class No2_10950 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();

        for (int i = 0; i < T; i++) {
            int A = scan.nextInt();
            int B = scan.nextInt();
            System.out.println(A + B);
        }
    }
}
