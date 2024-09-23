//https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/description/

class Solution {
    public int removeDuplicates(int[] nums) {
        //Tc: O(n) Sc: O(1) 
        int i = 0;
        for(int n :nums)
        {
            if(i<2 || n != nums[i-2])
            {
                nums[i] = n;
                i++;
            }
        }

        return i;
    }
}
