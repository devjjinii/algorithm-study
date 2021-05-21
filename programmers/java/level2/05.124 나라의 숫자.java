class Solution {
    public String solution(int n) {
        String answer = "";
        
        /*
         1%3 = 1 ----- 1
         2%3 = 2 ----- 2
         3%3 = 0 ----- 4
        */
        
        String[] num = {"4","1","2"};
        
        while(n >0) {
            answer = num[n%3] + answer;
            n = (n-1) / 3;
        }
        return answer;
    
    }
}
