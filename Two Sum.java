/*
 * Given nums = [2, 7, 11, 15], target = 9,

	Because nums[0] + nums[1] = 2 + 7 = 9,
	return [0, 1].
*/

class Solution {
    public int[] twoSum(int[] nums, int target) {
        for(int i=0; i < nums.length; ++i) {
            for(int j = i+1; j< nums.length; ++j) {
                if(nums[i] + nums[j] == target) {
                    return new int[]{i,j};
                }
            }
        }
        return null;
    }
}