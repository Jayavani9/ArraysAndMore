//https://leetcode.com/problems/continuous-subarray-sum/description


//Bruteforce Approach 
class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        //Tc: O(n^2) Sc: O(1) 
        int n = nums.length;

        for(int i = 0; i < n-1; i++)
        {
            int sum = nums[i];

            for(int j = i+1; j < n; j++)
            {
                sum += nums[j];
                if(sum%k == 0) return true;

            }
        }
        return false;
    }
}
