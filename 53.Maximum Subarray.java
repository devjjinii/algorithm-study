/*
Example:

Input: [-2,1,-3,4,-1,2,1,-5,4],
Output: 6
Explanation: [4,-1,2,1] has the largest sum = 6.

다시 풀기 -> 정답 확인하기.
*/


class Solution {
    public int maxSubArray(int[] nums) {
        if(n<=0) return 0;
       
        int maxSum = A[0];
        int curSum = A[0];
        
        for(int i=1; i<n; i++) {
            curSum =  curSum<=0 ? A[i] : A[i]+curSum;
            maxSum = max(maxSum , curSum);
        }
        return maxSum;
    }
}
