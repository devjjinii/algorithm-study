public class AddBinary {

	/*
	 *  Given two binary strings, return their sum (also a binary string).
		The input strings are both non-empty and contains only characters 1 or 0.
		
		Example 1:
		Input: a = "11", b = "1"
		Output: "100"

		Example 2:
		Input: a = "1010", b = "1011"
		Output: "10101"
	 * 
	 * */
	
	public static void main(String[] args) {
		System.out.println(addBinary("11","1"));
	}

	 public static String addBinary(String a, String b) {
	 
		 /* 
		  *   
        	String result = "";  
        	int s = 0;          
  
        	int i = a.length() - 1, j = b.length() - 1; 
	        while (i >= 0 || j >= 0 || s == 1) 
		        { 
		              
		            s += ((i >= 0)? a.charAt(i) - '0': 0); 
		            s += ((j >= 0)? b.charAt(j) - '0': 0); 
		  
		            result = (char)(s % 2 + '0') + result; 
		  
		            s /= 2; 
		  
		            i--; j--; 
		        } 
	          
    		return result; 
		  * 
		  * */
		 
     // 참고 : https://github.com/Blankj/awesome-java-leetcode/blob/master/note/067/README.md
     
		  StringBuilder sb = new StringBuilder();
	        int carry = 0, p1 = a.length() - 1, p2 = b.length() - 1;
	        while (p1 >= 0 && p2 >= 0) {
	            carry += a.charAt(p1--) - '0';
	            carry += b.charAt(p2--) - '0';
	            sb.insert(0, (char) (carry % 2 + '0'));
	            carry >>= 1;
	        }
	        while (p1 >= 0) {
	            carry += a.charAt(p1--) - '0';
	            sb.insert(0, (char) (carry % 2 + '0'));
	            carry >>= 1;
	        }
	        while (p2 >= 0) {
	            carry += b.charAt(p2--) - '0';
	            sb.insert(0, (char) (carry % 2 + '0'));
	            carry >>= 1;
	        }
	        /*
	         *    StringBuffer sb = new StringBuffer("abcdefghijk");
      			  sb.insert(2, "111");
      			  ab111cdefghijk
	         * */
	        
	        if (carry == 1) {
	            sb.insert(0, '1');
	        }
	        return sb.toString();
	    }
}

