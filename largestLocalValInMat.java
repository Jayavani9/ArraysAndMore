//https://leetcode.com/problems/largest-local-values-in-a-matrix/

class Solution {
    public int[][] largestLocal(int[][] grid) {
        //Tc: O(N*N)  Sc: O(N*N)
        int len = grid.length-2;

        int ans[][] = new int[len][len];

        for(int i = 0; i < len; i++)
        {
            for(int j = 0; j < len; j++)
            {
                ans[i][j] = maxim(grid, i, j);
            }
        }

        return ans;
    }

    private int maxim(int[][] grid, int i, int j)
    {
        int maximum = 0;
        for(int k = i; k < i+3; k++)
        {
            for(int l = j; l < j+3; l++)
            {
                maximum = Math.max(maximum, grid[k][l]);
            }
        }
        return maximum;
    }
}




