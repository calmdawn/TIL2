package 백준.반복문;

import java.util.Scanner;

public class No3_8393 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int sum = 0;

        for (int i = 1; i <= N; i++)
            sum = sum + i;
        System.out.println(sum);
    }
}
