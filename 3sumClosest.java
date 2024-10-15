//https://leetcode.com/problems/3sum-closest/description/

class Solution {
    public int threeSumClosest(int[] nums, int target) {
        //Tc: O(n^3) Sc: O(1) 
        int n = nums.length;
        int ans = Integer.MAX_VALUE;
        for(int i = 0; i < n-2; i++)
        {
            for(int j = i+1; j < n-1; j++)
            {
                for(int k = j+1; k < n; k++)
                {
                    int sum = nums[i]+nums[j]+nums[k];
                    if(Math.abs(sum-target) < Math.abs(ans-target))
                ans = sum;
                }

            }
        }
        return ans;
    }
}
