class Solution {
    public String solution(int n) {
        String answer = "";
        
        for(int i=0; i < n; i++) {
            if(i%2 == 0) {
                answer += "수";
            } else {
                answer += "박";
            }
        }
       return answer;
    }
}

 //public String solution(int n){
 //   String result = "";
 //   for (int i = 0; i < n; i++)
 //     result += i % 2 == 0 ? "수" : "박";
 //       return result;
 //}
