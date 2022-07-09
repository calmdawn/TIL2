package 백준.단계별로풀어보기.Lv1_입출력과사칙연산;

import java.util.Scanner;

public class No13_2588 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int n3, n4, n5 = 0;
        scan.close();

        n5 = num2 / 100;
        num2 = num2 % 100;
        n4 = num2 / 10;
        num2 = num2 % 10;
        n3 = num2;

        System.out.println(num1 * n3);
        System.out.println(num1 * n4);
        System.out.println(num1 * n5);
        System.out.println((num1 * n3) + (num1 * n4 * 10) + (num1 * n5 * 100));
    }
}
