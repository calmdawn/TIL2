package 백준.단계별로풀어보기.Lv1_입출력과사칙연산;

import java.util.Scanner;

public class No8_1008 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double a = scan.nextInt();
        double b = scan.nextInt();
        scan.close();

        System.out.print(a / b);
    }
}
