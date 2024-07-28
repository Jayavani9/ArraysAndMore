//https://leetcode.com/problems/single-element-in-a-sorted-array/

//Using Binary Search

class Solution {
    public int singleNonDuplicate(int[] nums) {
        //Tc: O(logn) Sc: O(1) 
         int left = 0;
         int right = nums.length-1;
    
        while(left < right)
        {
            int mid = left + (right - left)/2;
            if(mid % 2 == 1) mid -= 1;
            if(nums[mid] == nums[mid + 1]) left = mid + 2;
            else right = mid;
        }
    
        return nums[left];
    }
}





//Using linear Search
class Solution {
    public int singleNonDuplicate(int[] nums) {
        //Tc: O(n) Sc: O(1) 
        int n = nums.length;
        for(int i = 0; i < n-1; i += 2)
        {
            if(nums[i] != nums[i+1]) return nums[i];
        }

        return nums[n-1];
    }
}


//Using XOR
class Solution {
    public int singleNonDuplicate(int[] nums) {
        //Tc: O(n) Sc: O(1) 
        int ans = 0;
        for(int num: nums)
        {
            ans ^= num;
        }
        return ans;
    }
}

