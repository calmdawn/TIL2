package 백준.반복문;

import java.util.Scanner;

public class No1_2739 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();

        for (int i = 1; i < 10; i++)
            System.out.println(N + " * " + i + " = " + (N * i));
    }
}
