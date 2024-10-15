//https://leetcode.com/problems/3sum-closest/description/



//Two pointers Approach

class Solution {
    public int threeSumClosest(int[] nums, int target) {
        //Tc: O(nlogn+ n^2) ~ O(n^2) Sc: O(1) 
        int n = nums.length;
        Arrays.sort(nums);
        int ans = nums[0] + nums[1] + nums[2];

        for(int i = 0; i < n-2; i++)
        {
            int left = i+1;
            int right = n-1;
             while(left < right)
            {
                int sum = nums[i] + nums[left] + nums[right];
                if(sum == target) return sum;

                if(Math.abs(sum-target) < Math.abs(ans-target))
                ans = sum;
                if(sum < target) left++;
                else right--;
            }
        }
        return ans;
    }
}

//Bruteforce Solution
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
