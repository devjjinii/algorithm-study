package _013;

import java.util.HashMap;
import java.util.Map;

/*
Symbol       Value
I             1
V             5
X             10
L             50
C             100
D             500
M             1000

Example 1:
Input: "III"
Output: 3

Example 2:
Input: "IV"
Output: 4

Example 3:
Input: "IX"
Output: 9

Example 4:
Input: "LVIII"
Output: 58
Explanation: L = 50, V= 5, III = 3.

Example 5:
Input: "MCMXCIV"
Output: 1994
Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.

*/

public class RomanToInteger {
	/**
	 * 왼쪽 문자가 더 큰 수 면 서로 뺄셈
	 * 오른쪽 문자가 더 큰 수면 서로 덧셈
	 */
	private static int RoamanInteger(String s) {
        // Map
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
		
       int length = s.length();
       int result = map.get(s.charAt(length - 1));

       for(int i = length-2 ; i >= 0; i--) {
              if(map.get(s.charAt(i)) >= map.get(s.charAt(i+1))) {
                     result += map.get(s.charAt(i));
              } else {
                     result -= map.get(s.charAt(i));
              }
       }
          return result;
	}
	
	public static void main(String[] args) {
		System.out.println(RoamanInteger("IV")); // 4
		System.out.println(RoamanInteger("LVIII")); // 58
	}
}
