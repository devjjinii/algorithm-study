import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        String[] str = s.split(" "); // 문자열 공백으로 split
        
        ArrayList<Integer> arr = new ArrayList<Integer>();
         
        for(int i=0; i<str.length; i++) {
            arr.add(Integer.parseInt(str[i]));
        }
        
        Collections.sort(arr);
   
        return arr.get(0) + " " + arr.get(arr.size() - 1);
    }
}
