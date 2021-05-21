import java.util.*;

class Solution {
    public boolean solution(String[] phone_book) {
        boolean answer = true;
        
        // 맵 생성
        HashMap<String, String> map = new HashMap<String,String>();
        
        // for문 비교
        for(int i=0; i<phone_book.length; i++) {  // 배열 length
            map.put(phone_book[i], "prefix");
        }
        
        for(String phone: phone_book) {
            for(int j=0; j<phone.length(); j++) { // String length()
                if(map.containsKey(phone.substring(0,j))) {
                    answer = false;
                }
            }
        }
        return answer;
    }
}
