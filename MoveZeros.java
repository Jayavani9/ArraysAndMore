/*
283. Move Zeroes
Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.

Note that you must do this in-place without making a copy of the array.

Example 1:
Input: nums = [0,1,0,3,12]
Output: [1,3,12,0,0]
 
Example 2:
Input: nums = [0]
Output: [0]

 Example 3:
Input: [9,0,2,0,7]
Output: [9,2,7,0,0]

 Example 4:
Input: [6,4,1,0,0]
Output: [6,4,1,0,0]
*/

class Solution {
 //Tc: O(n) and Sc: O(1)
    public void moveZeroes(int[] nums) {
        int cnt = 0;
        for(int i = 0 ; i < nums.length;i++)
        {
            if(nums[i] == 0) cnt = cnt + 1;
            else if (cnt > 0)
            {
                int temp = nums[i];
                nums[i] = 0;
                nums[i-cnt] = temp;
            }
        }
    }
}
