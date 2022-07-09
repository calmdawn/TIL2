package 백준.단계별로풀어보기.Lv5_함수;

public class No2_4673 {
    static boolean[] selfNumbers = new boolean[10001];

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();

        for (int i = 1; i < 10001; i++)
            d(i);
        for (int j = 1; j < 10001; j++) {
            if (!selfNumbers[j])
                sb.append(j).append("\n");
        }

        System.out.print(sb);
    }

    public static void d(int n) {

        int newN = n;

        while (n > 0) {
            newN = newN + n % 10;
            n = n / 10;
        }
        if (newN <= 10000)
            selfNumbers[newN] = true;
    }
}
