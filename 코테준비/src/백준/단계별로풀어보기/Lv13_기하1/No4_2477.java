package 백준.단계별로풀어보기.Lv13_기하1;

import java.io.*;
import java.util.StringTokenizer;

public class No4_2477 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int standardNum = Integer.parseInt(br.readLine());
        StringTokenizer st;
        int[][] dirLens = new int[6][2];
        int[] widthMax = new int[2];
        int[] heightMax = new int[2];

        for (int i = 0; i < 6; i++) {
            st = new StringTokenizer(br.readLine());
            dirLens[i][0] = Integer.parseInt(st.nextToken());   //방향
            dirLens[i][1] = Integer.parseInt(st.nextToken());   //길이
        }
        //동쪽은 1, 서쪽은 2, 남쪽은 3, 북쪽은 4

        for (int i = 0; i < 6; i++) {
            if (dirLens[i][0] == 1 || dirLens[i][0] == 2) {
                if (widthMax[1] < dirLens[i][1]) {
                    widthMax[0] = i;
                    widthMax[1] = dirLens[i][1];
                }
            } else {
                if (heightMax[1] < dirLens[i][1]) {
                    heightMax[0] = i;       //몇번째에 방문했는지
                    heightMax[1] = dirLens[i][1];
                }
            }
        }

        int cnt = 0;    // 최대 너비, 최대 높이가 나오는 횟수, 연속 카운트
        int blankStartIdx = 0;
        int area = 0;
        for (int idx = 0; idx < 6; idx++) {
            if (idx == widthMax[0] || idx == heightMax[0])
                cnt++;
            if (cnt == 2) {
                if(Math.abs(widthMax[0] - heightMax[0]) == 5)
                    blankStartIdx = 2;
                else
                    blankStartIdx = idx + 2;
                break;
            }
        }
        area = widthMax[1] * heightMax[1]
                - dirLens[getBlankIdx(blankStartIdx)][1] * dirLens[getBlankIdx(blankStartIdx + 1)][1];

        bw.write(String.valueOf(area * standardNum));
        bw.flush();
        bw.close();

    }

    private static int getBlankIdx(int blankStartIdx) {
        if (blankStartIdx > 5)
            return blankStartIdx - 6;
        return blankStartIdx;
    }
}
