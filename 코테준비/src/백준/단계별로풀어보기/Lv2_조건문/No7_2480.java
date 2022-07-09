package 백준.단계별로풀어보기.Lv2_조건문;

import java.util.Scanner;

public class No7_2480 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n1 = scan.nextInt();
        int n2 = scan.nextInt();
        int n3 = scan.nextInt();

        if (n1 == n2 && n2 == n3) {  //같은 눈이 3개
            System.out.println(10000 + (n1 * 1000));
        } else if (n1 == n2) { // 같은 눈이 2개
            System.out.println(1000 + (n1 * 100));
        } else if (n1 == n3) { // 같은 눈이 2개
            System.out.println(1000 + (n1 * 100));
        } else if (n2 == n3) { // 같은 눈이 2개
            System.out.println(1000 + (n2 * 100));
        } else {  //모두 다른 눈
            System.out.println(Math.max(Math.max(n1, n2), n3) * 100);
        }
    }
}
