/*
 * Example 1:
   Given nums = [1,1,2],

Your function should return length = 2, with the first two elements of nums being 1 and 2 respectively.
It doesn't matter what you leave beyond the returned length.
 
 * Example 2:
 * Given nums = [0,0,1,1,1,2,2,3,3,4],
 * 
Your function should return length = 5, with the first five elements of nums being modified to 0, 1, 2, 3, and 4 respectively.
It doesn't matter what values are set beyond the returned length.
 * 
 * 
 * // nums is passed in by reference. (i.e., without making a copy)
	int len = removeDuplicates(nums);

	// any modification to nums in your function would be known by the caller.
	// using the length returned by your function, it prints the first len elements.
	for (int i = 0; i < len; i++) {
    	print(nums[i]);
	}
 * 
 * 
 * */

public class RemoveDuplicates {

	public static void main(String[] args) {
		
		int[] nums = {1,1,2}; //2
		int[] test = {0,0,1,1,1,2,2,3,3,4}; //5
		System.out.println("Output : " +removeDuplicates(nums));
		System.out.println("Output : " +removeDuplicates(test));
	}

	// 배열의 값이 중복값인지 아닌지 체크
	public static int removeDuplicates(int[] nums) {
		if(nums.length == 0) return 0;
		
		int result = 1;
		for(int i = 1; i < nums.length; i++) {
			if(nums[i] != nums [i-1]) {
				nums[result++] = nums[i];
			}
		}
		return result;
	}
}

/*
 * int len = nums.length;
		if (len <= 1) return len;
		int tail = 1;
		for(int i = 1; i < len; i++) {
			if(nums[i-1] != nums[i]) {
				nums[tail++] = nums[i];
			}
		}
		return tail;
 * 
 */
