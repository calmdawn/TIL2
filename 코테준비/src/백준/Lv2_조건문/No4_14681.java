package 백준.Lv2_조건문;

import java.util.Scanner;

public class No4_14681 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int y = scan.nextInt();
        int quadN = 0;

        if (x > 0 && y > 0)
            quadN = 1;
        else if (x < 0 && y > 0)
            quadN = 2;
        else if (x < 0 && y < 0)
            quadN = 3;
        else
            quadN = 4;

        System.out.println(quadN);
    }
}
