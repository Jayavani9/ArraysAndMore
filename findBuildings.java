1762. Buildings With an Ocean View

There are n buildings in a line. You are given an integer array heights of size n that represents the heights of the buildings in the line.

The ocean is to the right of the buildings. A building has an ocean view if the building can see the ocean without obstructions. 
Formally, a building has an ocean view if all the buildings to its right have a smaller height.

Return a list of indices (0-indexed) of buildings that have an ocean view, sorted in increasing order.

Example 1:

Input: heights = [4,2,3,1]
Output: [0,2,3]
Explanation: Building 1 (0-indexed) does not have an ocean view because building 2 is taller.
Example 2:

Input: heights = [4,3,2,1]
Output: [0,1,2,3]
Explanation: All the buildings have an ocean view.
Example 3:

Input: heights = [1,3,2,4]
Output: [3]
Explanation: Only building 3 has an ocean view.

class Solution {
    public int[] findBuildings(int[] heights) {
        //Tc: O(n) Sc: O(1)
        List<Integer> ans = new ArrayList<>();
        int maxim = -1;
        for(int i = heights.length-1; i >=0 ; i--)
        {
            if(heights[i] > maxim)
            {
                ans.add(i);
                maxim = heights[i];
            }
        }
        int[] res = new int[ans.size()];
        int n = res.length;
        for(int i = 0 ; i < ans.size(); i++)
        {
            res[i] = ans.get(n-1);
            n--;
        }
        return res;
    }
}
