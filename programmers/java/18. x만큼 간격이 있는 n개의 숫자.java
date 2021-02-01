//import java.util.*;

class Solution {
    public long[] solution(int x, int n) { // int
        long[] answer = new long[n];
        
        for(int i =0; i<n; i++) {
           answer[i] = ((long)x * (i+1));  // 처음에 틀림 (-> 형변환)
            //System.out.print(answer[i]);
        }
        return answer;
    }
}
