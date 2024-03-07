334. Increasing Triplet Subsequence


Given an integer array nums, return true if there exists a triple of indices (i, j, k) such that i < j < k and nums[i] < nums[j] < nums[k]. 
If no such indices exists, return false.

 

Example 1:

Input: nums = [1,2,3,4,5]
Output: true
Explanation: Any triplet where i < j < k is valid.
Example 2:

Input: nums = [5,4,3,2,1]
Output: false
Explanation: No triplet exists.
Example 3:

Input: nums = [2,1,5,0,4,6]
Output: true


class Solution {
    //Tc: O(n) Sc: O(1)
  public boolean increasingTriplet(int[] nums) {
        int n = nums.length;
        if(n < 3) return false;
        int p1 = Integer.MAX_VALUE;
        int p2 = Integer.MAX_VALUE;
        for(int i = 0; i < n; i++)
        {
            if(nums[i] <= p1)
            {
                p1 = nums[i];
            }
            else if(nums[i] <= p2)
            {
                p2 = nums[i];
            }
            else
            {
                return true;
            }
        }
        return false;
    }
}
