import java.util.*;

class Solution {
    public String[] solution(String[] strings, int n) {
    
        Arrays.sort(strings, new Comparator<>() { 
           @Override
            public int compare(String a, String b) {
                if(a.charAt(n) == b.charAt(n)) return a.compareTo(b);
                else return a.charAt(n) - b.charAt(n);
            }
        });
      
        return strings;
    }
}
