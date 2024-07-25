//https://leetcode.com/problems/find-pivot-index/

class Solution {
    public int pivotIndex(int[] nums) {
        //Tc: O(n) Sc: O(1)
        int n = nums.length;
        int sum = 0;
        for(int i = 0; i < n; i++)
        {
            sum += nums[i];
        }
        int lSum = 0;
        for(int i = 0; i < n; i++)
        {
            if(lSum == sum - lSum - nums[i])
            {
                return i;
            }
            lSum += nums[i];
        }
        return -1;
    }
}
