package 백준.Lv11_정렬;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class No3_10989 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        ArrayList<Integer> numberList = new ArrayList<>();

        for (int i = 0; i < N; i++)
            numberList.add(Integer.valueOf(br.readLine()));

        Collections.sort(numberList);

        bw.write(getAverage(numberList) + "\n");
        bw.write(getMid(numberList, N) + "\n");
        bw.write(getMost(numberList, N) + "\n");
        bw.write(getRange(numberList) + "\n");

        bw.flush();
        bw.close();
    }

    private static int getRange(ArrayList<Integer> numberList) {
        return numberList.get(numberList.size() - 1) - numberList.get(0);
    }

    private static int getMost(ArrayList<Integer> numberList, int N) {
        int prev = numberList.get(0);
        int mostCnt = 1;
        int curCnt = 1;
        int minIdx = 0;

        for (int i = 1; i < numberList.size(); i++) {
            if (prev == numberList.get(i)) {
                curCnt++;
            } else {
                curCnt = 1;
                prev = numberList.get(i);
            }

            if (curCnt > mostCnt) {
                mostCnt = curCnt;
                minIdx = i;
            }
        }

        prev = numberList.get(minIdx);

        for (int j = minIdx + 1; j < numberList.size(); j++) {
            if (prev == numberList.get(j)) {
                curCnt++;
            } else {
                curCnt = 1;
                prev = numberList.get(j);
            }

            if (mostCnt == curCnt) {
                minIdx = j;
                break;
            }
        }

        return numberList.get(minIdx);
    }

    private static int getMid(ArrayList<Integer> numberList, int N) {
        return numberList.get(N / 2);
    }

    private static int getAverage(ArrayList<Integer> numberList) {
        double avg = 0;
        for (int num : numberList)
            avg = avg + num;
        avg = avg / numberList.size();
        return (int) Math.round(avg);
    }
}
