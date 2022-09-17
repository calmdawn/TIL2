package 프로그래머스.연습문제;

//Lv2 JadenCase 문자열 만들기

class Solution2 {
    public String solution(String s) {
        String answer = "";
        boolean isFlag = true;
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (isFlag) {
                isFlag = false;
                if ('a' <= ch && ch <= 'z') {
                    ch = (char) (ch - 32);
                } else if (ch == ' ')
                    isFlag = true;
            } else {
                if ('A' <= ch && ch <= 'Z') {
                    ch = (char) (ch + 32);
                } else if (ch == ' ')
                    isFlag = true;
            }

            sb.append(ch);
        }
        answer = sb.toString();
        return answer;
    }
}
