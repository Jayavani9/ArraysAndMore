53. Maximum Subarray

Given an integer array nums, find the subarray with the largest sum, and return its sum.
  
Example 1:

Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
Output: 6
Explanation: The subarray [4,-1,2,1] has the largest sum 6.
Example 2:

Input: nums = [1]
Output: 1
Explanation: The subarray [1] has the largest sum 1.
Example 3:

Input: nums = [5,4,-1,7,8]
Output: 23
Explanation: The subarray [5,4,-1,7,8] has the largest sum 23.

class Solution {
    //Tc: O(n) Sc: O(1)
    public int maxSubArray(int[] nums) {
        int sum = 0;
        int start = 0;
        int ansSt = -1;
        int ansEnd = -1;
        int maxSum = Integer.MIN_VALUE;
        for(int i = 0 ; i < nums.length; i++)
        {
            if(sum == 0)  start = i;
            sum += nums[i];
            if(sum > maxSum) 
            {
            maxSum = sum;
            ansSt = start;
            ansEnd = i;
            }
            if(sum < 0) sum = 0;
        }
        System.out.println(ansSt+ " " + ansEnd);
        return maxSum;

        /*
        //Tc: O(n^2) Sc: O(1)
        int max = Integer.MIN_VALUE;
        int n = nums.length;
        for(int i = 0 ; i < n ; i++)
        {
            int sum = 0;
            for(int j = i; j < n ; j++)
            {
                sum += nums[j];
                max = Math.max(max, sum);
            }
        }
        return max;
        */
    }
}
