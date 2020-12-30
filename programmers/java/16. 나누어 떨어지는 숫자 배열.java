import java.util.*;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        int [] answer = {};
        
        answer = Arrays.stream(arr).filter(e -> e % divisor == 0).toArray(); 
        // 예외처리
        Arrays.sort(answer);
        
        if(answer.length == 0) {
            answer = new int[]{-1};
        }
        
        return answer;
    }
}
