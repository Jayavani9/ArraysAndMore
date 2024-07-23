//https://leetcode.com/problems/maximum-difference-between-increasing-elements/description/?envType=company&envId=nvidia&favoriteSlug=nvidia-three-months


//Tc: O(n) Sc: O(1) 
class Solution {
    public int maximumDifference(int[] nums) {
        int ans = -1;
        int min = Integer.MAX_VALUE;
        for(int i : nums)
        {
            if(i <= min) min = i;
            else ans = Math.max(ans, i - min);
        }
            return ans;
    }
}



//Tc: O(n^2) Sc: O(1)
/*
 int n = nums.length;
        int ans = -1;
        for(int i = 0; i < n; i++)
        {
            for(int j = i+1; j < n; j++)
            {
                if(nums[i] < nums[j])
                {
                    ans = Math.max(ans, nums[j] - nums[i]);
                }
            }
        }
        return ans;
*/
