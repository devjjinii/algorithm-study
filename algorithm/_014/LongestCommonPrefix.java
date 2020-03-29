package _014;

import java.util.Arrays;

/*

Example 1:
Input: ["flower","flow","flight"]
Output: "fl"

Example 2:
Input: ["dog","racecar","car"]
Output: ""
Explanation: There is no common prefix among the input strings.

Note:
All given inputs are in lowercase letters a-z.
 * */

// Hint : http://www.goodtecher.com/leetcode-14-longest-common-prefix/
// Hint : https://java2blog.com/longest-common-prefix-in-array-of-strings-java/

public class LongestCommonPrefix {

	public static void main(String[] args) {
		//String[] strs = {"javahello","javaworld","javacode"};
				String[] input = {"flower","flow","flight"};
				String output = getLongestCommonPrefix(input);
				System.out.println("input : "+ Arrays.toString(input));
				System.out.println("output : "+ output);

	}

	private static String getLongestCommonPrefix(String[] input) {

		//If there is no common prefix, return an empty string "". 
		if(input == null || input.length == 0) {
			 return "";
		 }
		
		String minStr = getMinString(input);  //[flower,flow,flight]
		 
		int minPrefixStrLength = minStr.length();
		
		for(int i=0; i<input.length; i++) {
			int j;
			
			for( j = 0; j < minPrefixStrLength; j++){
				if(minStr.charAt(j) != input[i].charAt(j)) {
					break;
				}
			}
		 
			if(j < minPrefixStrLength) {
				minPrefixStrLength = j;
			}
		}
			return minStr.substring(0,minPrefixStrLength);
	}

	private static String getMinString(String[] strArr) {
		 
		String minStr = strArr[0];
		
		for(int i = 1; i < strArr.length; i++){
			if(strArr[i].length() < minStr.length()) {
				minStr=strArr[i];
			}
		}
			return minStr;
	}

}

//.......

/*class Solution {
  public String longestCommonPrefix(String[] strs) {
      if (strs == null || strs.length == 0) {
          return "";
      }
      
      String longestCommonPrefix = strs[0];
      
      for (int i = 1; i < strs.length; i++) {
          int j = 0;
          String currentString = strs[i];
          
          while (j < longestCommonPrefix.length() && j < currentString.length() && longestCommonPrefix.charAt(j) == currentString.charAt(j)) {
              j++;
          }
          
          if (j == 0) {
              return "";
          }
          longestCommonPrefix = longestCommonPrefix.substring(0, j);
      }
      return longestCommonPrefix;
  }
}*/

