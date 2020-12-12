import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        ArrayList<Integer> arrList = new ArrayList<>();
        
        if(arr.length == 1) { // 1이면 -1
            return new int[]{-1};
        }
        
        for(int a : arr) {
            arrList.add(a);
        }
        
        int min = arr[0];
        for(int a : arrList) { // 최솟값
            if(a < min) {
                min = a;
            }
        }
        
        arrList.remove(arrList.indexOf(min)); // 최솟값 제거
        
        if(arrList.size() > 1) {
            answer = new int[arrList.size()];
            for( int i=0; i < arrList.size(); i++) {
                answer[i] = arrList.get(i);
            }
        }
        
        return answer;
    }
}

//  다른사람
//  if (arr.length <= 1) return new int[]{ -1 };
//       int min = Arrays.stream(arr).min().getAsInt();
//       return Arrays.stream(arr).filter(i -> i != min).toArray();