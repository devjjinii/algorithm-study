package _035;
/*
 * Example 1:
Input: [1,3,5,6], 5
Output: 2

Example 2:
Input: [1,3,5,6], 2
Output: 1

Example 3:
Input: [1,3,5,6], 7
Output: 4

Example 4:
Input: [1,3,5,6], 0
Output: 0
 * 
 * 순서 비교해서 target이 들어갈 곳 
 * */

public class SearchInsertPosition {

	public static void main(String[] args) {
		int[] nums = {1,3,5,6};
		System.out.println(searchInsert(nums , 2));
	}
	
	public static int searchInsert(int[] nums, int target) {
		for(int i = 0; i < nums.length; i++) {
			if(nums[i] >= target) {
				return i;
			}
		}
		return nums.length;
	}
}
