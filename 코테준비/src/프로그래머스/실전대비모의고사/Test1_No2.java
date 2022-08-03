package 프로그래머스.실전대비모의고사;

import java.util.HashMap;

class Test1_No2 {
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;
        int sIdx = 0;
        int eIdx = 9;
        int remainCnt = 10;  //구매해야할 제품의 개수
        HashMap<String, Integer> originMap = new HashMap<>();
        HashMap<String, Integer> wantMap = new HashMap<>();

        for(int i=0; i<want.length;i++){
            originMap.put(want[i],number[i]);
            wantMap.put(want[i],number[i]);
        }

        for(int i=0; i<10; i++){    //처음 10일 세팅
            if(wantMap.get(discount[i]) != null){   //구매하려는 제품이 있는경우
                wantMap.put(discount[i], wantMap.get(discount[i])-1);
                if(wantMap.get(discount[i]) >= 0)
                    remainCnt--;
            }
        }

        while(true){
            // System.out.println("날짜 : " + sIdx + "  : "  + eIdx + " remainCnt : " + remainCnt);
            if(remainCnt == 0){  //연속으로 일치한 경우
                answer++;
            }

            if(wantMap.get(discount[sIdx]) != null){
                wantMap.put(discount[sIdx], wantMap.get(discount[sIdx])+1);
                if(0 < wantMap.get(discount[sIdx]) && wantMap.get(discount[sIdx]) <= originMap.get(discount[sIdx]))
                    remainCnt++;
            }
            sIdx++;
            eIdx++;

            if(eIdx == discount.length)
                break;

            if(wantMap.get(discount[eIdx]) != null){
                wantMap.put(discount[eIdx], wantMap.get(discount[eIdx])-1);
                if(0 <= wantMap.get(discount[eIdx]) && wantMap.get(discount[eIdx]) < originMap.get(discount[eIdx]))
                    remainCnt--;
            }
        }

        return answer;
    }
}