2089. Find Target Indices After Sorting Array

You are given a 0-indexed integer array nums and a target element target.

A target index is an index i such that nums[i] == target.

Return a list of the target indices of nums after sorting nums in non-decreasing order. 
If there are no target indices, return an empty list. The returned list must be sorted in increasing order.

 

Example 1:

Input: nums = [1,2,5,2,3], target = 2
Output: [1,2]
Explanation: After sorting, nums is [1,2,2,3,5].
The indices where nums[i] == 2 are 1 and 2.
Example 2:

Input: nums = [1,2,5,2,3], target = 3
Output: [3]
Explanation: After sorting, nums is [1,2,2,3,5].
The index where nums[i] == 3 is 3.
 
1 <= nums.length <= 100
1 <= nums[i], target <= 100



 Solution : 

Approach 1 : Using Sorting 

 //Tc : O(nlogn) Sc: O(1)
 Arrays.sort(nums);
 ArrayList<Integer> ans = new ArrayList<>();
 for(int i = 0 ; i < nums.length; i++)
      {
          if(nums[i] == target)
           {
               ans.add(i);
               
            }
        }
    return ans;
}
}

Approach 2 : Using LessTarget and EqualTarget Cnt 

 //Tc: O(n) and Sc: O(1)
 class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
         int countTarget = 0 , lessTarget = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]<target) lessTarget++;
            if(nums[i]==target) countTarget++;
        }
        List<Integer> ans = new ArrayList<>();
        for(int i=0; i<countTarget; i++){
            ans.add(lessTarget + i);
        }
        return ans;

    }
}




  
