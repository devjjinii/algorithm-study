import java.util.*;

class Solution {
    public int[] solution(long n) {
        
        String[] strArr = Long.toString(n).split("");
        int[] answer = new int[strArr.length];
        
        Collections.reverse(Arrays.asList(strArr));
        
        for(int i =0; i < strArr.length; i++) {
            answer[i] = Integer.parseInt(strArr[i]); //string -> int
        }
        return answer;
    }
}


// String a = "" + n;  // Integer.toString 
// String + int >> String


