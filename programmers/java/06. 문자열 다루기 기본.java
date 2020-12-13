class Solution {
    public boolean solution(String s) {
       
        if(s.length() == 4 || s.length() == 6) {
           for(int i=0; i < s.length(); i++) {
               
               char ch = s.charAt(i);
              //48 ~ 57은 아스키 코드로 0~9이다.
              // 숫자가 아니면 return 
               if(ch < '0' || ch > '9') {
                   return false;
               }
           }
            return true;
            
        } else {
            return false;   
        }
    }
}


// public boolean solution(String s) {
//       if(s.length() == 4 || s.length() == 6){
//           try{
//               int x = Integer.parseInt(s);
//               return true;
//           } catch(NumberFormatException e){
//               return false;
//           }
//       }
//       else return false;
// }