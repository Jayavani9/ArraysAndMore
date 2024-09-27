//https://leetcode.com/problems/wiggle-sort/description/

//

class Solution {
    //Tc: O(n) Sc: O(1) 
    private void swap (int[] nums, int i, int j)
    {
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }

    public void wiggleSort(int[] nums) {
        for(int i = 0; i < nums.length-1; i++)
        {
            if(((i%2 == 0) && nums[i] > nums[i+1]) ||
                ((i%2 == 1) && nums[i] < nums[i+1]))
            {
                swap(nums, i , i+1);
            }
        }
    }
}

//Using sort and swap
class Solution {
    //Tc: O(n log n) Sc: O(1) 
    private void swap (int[] nums, int i, int j)
    {
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }

    public void wiggleSort(int[] nums) {
        Arrays.sort(nums);
        for(int i = 1; i < nums.length-1; i += 2)
        {
            swap(nums, i, i+1);
        }
    }
}
