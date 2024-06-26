//https://leetcode.com/problems/maximum-average-subarray-i/description/


class Solution {
    public double findMaxAverage(int[] nums, int k) {
        //Tc: O(n) Sc: O(1)
        int n = nums.length;
        int sum = 0;
        double res = 0;
        for(int i = 0; i < k; i++)
        {
            sum += nums[i];
        }

        res = sum;

        for(int i = k; i < n ; i++)
        {
            sum += nums[i] - nums[i-k];
            res = Math.max(sum, res);
        }
        
        return res/k;
        
    }
}
