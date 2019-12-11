/*
	Example:
	Input: [-2,1,-3,4,-1,2,1,-5,4],
	Output: 6
	
	https://www.youtube.com/watch?v=2MmGzdiKR9Y 설명 짱이다 :)
	참조 : https://github.com/Blankj/awesome-java-leetcode 
	
*/

public class MaximumSubarray {

	
	public static void main(String[] args) {
		 int arr[] = {4, -1, 2, 1}; 
	     int n = arr.length; 
	     System.out.println(maxSubArray(arr));
	
	}
	
	public static int maxSubArray(int[] nums) {
        return helper(nums, 0, nums.length - 1);
    }

	private static int helper(int[] nums, int left, int right) {
		
		// Explanation: [4,-1,2,1] has the largest sum = 6.
		// 배열에서 가장 큰 연속된 부분배열 합
		
		if(left >= right) {
			return nums[left];
		}
		
		int mid = (left + right) >> 1;
		int leftAns = helper(nums, left, mid);
		int rigthAns = helper(nums, mid+1, right);
		int leftMax = nums[mid];
		int rightMax = nums[mid + 1];
		int temp = 0;
		
		for(int i=mid; i>=left; --i) {
			temp += nums[i];
			if(temp > leftMax) leftMax = temp;
		}
		temp = 0;
		
		for(int i=mid+1; i<=right; ++i) {
			temp += nums[i];
			if(temp > rightMax) rightMax = temp;
		}
		return Math.max(Math.max(leftAns, rigthAns), leftMax + rightMax);
		
	}
}

