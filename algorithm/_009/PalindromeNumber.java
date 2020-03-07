package _009;
/*
Example 1:
Input: 121
Output: true

Example 2:
Input: -121
Output: false
Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.

Example 3:
Input: 10
Output: false
Explanation: Reads 01 from right to left. Therefore it is not a palindrome.

palindrome : 거꾸로 읽어도 제대로 읽는 것과 같은 문장이나 낱말
*/
public class PalindromeNumber {
	
	public static void main(String[] args) {
		System.out.println(isPalindrome(123));
		System.out.println(isPalindrome(654738));
		System.out.println(isPalindrome(-142));
	}

	public static boolean isPalindrome(int x) {
		//System.out.println("Input : " + x);
		
		int y = 0;
		if(x < 0 || (x % 10 == 0 && x != 0 )) {
			return false;
		}
		
		while(x > y) {
			y = (x % 10) + (y * 10); 
			x = x/10; 
		}
		
		//System.out.println("Output : " + y + x );
		return (x == y) || (x == y/10);
	}
}
