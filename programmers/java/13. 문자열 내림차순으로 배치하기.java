import java.util.*;

class Solution {
    public String solution(String s) {
        String[] array = s.split("");
        Arrays.sort(array);
        
        // 정적
        Collections.reverse(Arrays.asList(array));
        return String.join("", array);
        
    }
}
