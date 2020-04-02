package _028;

/*Return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.
Example 1:
Input: haystack = "hello", needle = "ll"
Output: 2

Example 2:
Input: haystack = "aaaaa", needle = "bba"
Output: -1

Clarification:
What should we return when needle is an empty string? This is a great question to ask during an interview.
For the purpose of this problem, we will return 0 when needle is an empty string. This is consistent to C's strstr() and Java's indexOf().
 * 
 * */

public class ImplementStr {

	public static void main(String[] args) {
		System.out.println(strStr("hello","ll"));
		System.out.println(strStr("aaaaa","bba"));
	}

	// 메인에서 실행해야 할 메서드 (static 추가)
	 public static int strStr(String haystack, String needle) {
		 
	        if (haystack.length() < needle.length() ) return -1;
	        
	        for (int i = 0; ; i++) {
	            if (i + needle.length() > haystack.length()) return -1;
	
	            for (int j = 0; ; j++) {
	                if (j == needle.length()) return i;
	                // 입력받은 index 번째 문자를 반환한다.
	                if (haystack.charAt(i + j) != needle.charAt(j)) break;
	            }
	        }
	    }

}
