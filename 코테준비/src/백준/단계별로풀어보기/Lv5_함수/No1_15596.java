package 백준.단계별로풀어보기.Lv5_함수;

public class No1_15596 {
    public static void main(String[] args) {

    }

    long sum(int[] a) {
        long sum = 0;

        for (int n : a)
            sum = sum + n;
        return sum;
    }
}
