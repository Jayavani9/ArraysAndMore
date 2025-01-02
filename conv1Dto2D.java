//https://leetcode.com/problems/convert-1d-array-into-2d-array/

class Solution {
    public int[][] construct2DArray(int[] original, int m, int n) {
        //Tc: O(m*n) Sc: O(1)
        if(m*n != original.length) return new int[0][0];
        int[][] ans = new int[m][n];

        int ind = 0;

        for(int i = 0; i < m; i++)
        {
            for(int j = 0; j < n; j++)
            {
                ans[i][j] = original[ind];
                ind++;
            }
        }
         return ans;
    }
}
