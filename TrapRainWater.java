42. Trapping Rain Water
  
Given n non-negative integers representing an elevation map where the width of each bar is 1, compute how much water it can trap after raining.
  
Input: height = [0,1,0,2,1,0,1,3,2,1,2,1]
Output: 6
Explanation: The above elevation map (black section) is represented by array [0,1,0,2,1,0,1,3,2,1,2,1]. 
In this case, 6 units of rain water (blue section) are being trapped.
  
Example 2:
Input: height = [4,2,0,3,2,5]
Output: 9


class Solution {
    public int trap(int[] height) {
        Tc: O(n) and Sc: O(n)
        if(height == null || height.length <3)
        {
            return 0;
        }
        int len = height.length;
        int[] lMax = new int [len];
        int[] rMax = new int[len];
        lMax[0] = height[0];
        for(int i = 1; i < len; i++)
        {
            lMax[i] = Math.max(lMax[i-1],height[i]);
        }
        rMax[len-1] = height[len-1];
        for (int i = len - 2; i >= 0; i--) {
            rMax[i] = Math.max(rMax[i + 1], height[i]);
        }
        int trap = 0;
        for (int i = 1; i < len - 1; i++) {
            int h = Math.min(lMax[i], rMax[i]);
            trap += h - height[i];
        }

        return trap;
        
    }
}
