package 백준.단계별로풀어보기.Lv2_조건문;

import java.util.Scanner;

public class No6_2525 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int A = scan.nextInt(); // 현재 시
        int B = scan.nextInt(); // 현재 분
        int C = scan.nextInt(); // 요리하는데 필요한 시간
        int h, m;

        if (B + C >= 60) {
            h = A + ((B + C) / 60);
            m = (B + C) % 60;
            if (h > 23)
                h = h - 24;
        } else {
            h = A;
            m = B + C;
        }

        System.out.println(h + " " + m);
    }
}
