package 프로그래머스.해시;

public class Solution02 {
    public boolean solution(String[] phone_book) {
        boolean answer = true;
        for(int i=0; i < phone_book.length; i++){
            for(int j=0; j < phone_book.length; j++){
                if(phone_book[i].indexOf(phone_book[j]) == 0 && i != j)
                    answer = false;
            }
            if(answer == false)
                break;
        }
        return answer;
    }
}
