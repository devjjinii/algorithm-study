import java.util.*;

class Solution {
    boolean solution(String s) {
     
        Stack<Character> stack = new Stack(); // 스택 생성
        for (int i=0; i<s.length(); i++) {
            if(s.charAt(i) == '(') {  // for문 돌아 ( 가 있으면
                stack.push(s.charAt(i));  // 넣고
              
            } else {
                if(stack.isEmpty()) return false;
                stack.pop(); // )이면 꺼내고
            }
        }
        if(stack.isEmpty()) {
            return true;
        }
        return false;
    }
}



// 스택을 안쓰고 다른 사람 풀이
class Solution {
    boolean solution(String s) {
        boolean answer = false;
        int count = 0;
        for(int i = 0; i<s.length();i++){
            if(s.charAt(i) == '('){
                count++;
            }
            if(s.charAt(i) == ')'){
                count--;
            }
            if(count < 0){
                break;
            }
        }
        if(count == 0){
            answer = true;
        }

        return answer;
    }
}
