package 백준.조건문;

import java.util.Scanner;

public class No1_1330 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        scan.close();

        if(a > b)
            System.out.println(">");
        else if(a < b)
            System.out.println("<");
        else
            System.out.println("==");
    }
}
