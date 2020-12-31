class Solution {
    public String solution(String s) {
        int len = s.length();
        
        if(len %2 == 0){  //짝수
            return s.substring(len/2-1, len/2+1);
        } else { //홀수
            return Character.toString(s.charAt(len/2));
        }   
    }
}
