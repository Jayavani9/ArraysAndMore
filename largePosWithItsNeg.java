//https://leetcode.com/problems/largest-positive-integer-that-exists-with-its-negative/description/

//Using HsshSet
class Solution {
    public int findMaxK(int[] nums) {
        //Tc: O(n) Sc: O(n) 
        int ans = -1;

        HashSet<Integer> set = new HashSet<>();

        for(int n: nums)
        {
            if(Math.abs(n) > ans && set.contains(-n)) ans = Math.abs(n);
            set.add(n);
        }
        return ans;
    }
}



//Using Sorting
class Solution {
    public int findMaxK(int[] nums) {
        //Tc: O(nlogn) Sc: O(n) for sort(worst case) 
        Arrays.sort(nums);
        int low = 0;
        int high = nums.length-1;

        while(low < high)
        {
            if(-nums[low] == nums[high]) return nums[high];
            else if(-nums[low] > nums[high]) low++;
            else high--;
        }
        return -1;
    }
}
