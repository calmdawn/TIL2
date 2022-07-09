package 백준.단계별로풀어보기.Lv2_조건문;

import java.util.Scanner;

public class No5_2884 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int h = scan.nextInt();
        int m = scan.nextInt();

        if (m >= 45) {  //설정한 알람이 45분보다 큰경우
            m = m - 45;
        } else {
            if (h == 0)    //설정한 알람의 시간이 0시인 경우
                h = 24;
            h = h - 1;
            m = m + 15;
        }

        System.out.println(h + " " + m);
    }
}
