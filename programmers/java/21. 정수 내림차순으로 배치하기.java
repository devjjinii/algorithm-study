import java.util.*;

class Solution {
    public long solution(long n) {
      
        String[] arr = (String.valueOf(n)).split(""); // null 방지
       
        Arrays.sort(arr);
        Collections.reverse(Arrays.asList(arr));
        
        long answer = Long.parseLong(String.join("", arr));
        
        return answer;
    }
}
