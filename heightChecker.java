//https://leetcode.com/problems/height-checker/description/

class Solution {
    public int heightChecker(int[] heights) {
        //Tc: O(nlogn) Sc: O(n) 
        int cnt = 0;
        int[] sorted = new int[heights.length];
        for(int i = 0; i < sorted.length; i++)
        {
            sorted[i] = heights[i];
        }

        Arrays.sort(sorted);

        for(int i = 0; i < sorted.length; i++)
        {
            if(heights[i] != sorted[i]) cnt++;
        }
        return cnt;
    }
}
