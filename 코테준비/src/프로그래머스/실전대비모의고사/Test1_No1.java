package 프로그래머스.실전대비모의고사;

class Test1_No1 {
    public String solution(String X, String Y) {
        String answer ="";

        int[] xNumCnt = new int[10];
        int[] numbers = new int[10];
        int idx = 9;
        StringBuffer sb = new StringBuffer();

        for(int i=0; i<X.length(); i++){
            xNumCnt[X.charAt(i)-'0']++;
        }

        for(int i=0; i<Y.length(); i++){
            numbers[Y.charAt(i)-'0']++;
        }

        for(int i=0; i<10; i++){
            numbers[i] = Math.min(xNumCnt[i], numbers[i]);
        }

        while(idx >=0){
            if(numbers[idx] == 0)
                idx--;
            else{
                sb.append(idx);
                numbers[idx]--;
            }
        }
        answer = sb.toString();

        if(answer.equals("") )  //짝궁이없는경우
            return "-1";
        else if(answer.charAt(0) == '0')  //0만있는경우
            return "0";
        return answer;
    }
}