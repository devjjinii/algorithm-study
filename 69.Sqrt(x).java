public class Sqrt {

	/*
	*   Example 1:
		Input: 4
		Output: 2

		Example 2:
		Input: 8
		Output: 2
		Explanation: The square root of 8 is 2.82842..., and since 
		             the decimal part is truncated, 2 is returned. 
	 * */
	
	public static void main(String[] args) {
		System.out.println(mySqrt(8));
		
	}

	  public static int mySqrt(int x) {
		  
//		  long n = x;
//		  while (n * n > x) {
//			  n = (n + x / n) >> 1;
//		  }
//		  
//		  return (int) n;
		  
		  double result = Math.sqrt(x);
		  return (int) result;
	  }
}

