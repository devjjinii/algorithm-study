class Solution {
    public String solution(String[] seoul) {
        String answer = "";
        
        for(int i=0; i<seoul.length; i++) {
            if(seoul[i].equals("Kim")) {
                answer = "김서방은 " + i + "에 있다";
                break;
            }
        }
        return answer;
    }
}


//  int x = Arrays.asList(seoul).indexOf("Kim");
//  return "김서방은 "+ x + "에 있다";