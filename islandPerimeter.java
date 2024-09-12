//https://leetcode.com/problems/island-perimeter/

class Solution {
    public int islandPerimeter(int[][] grid) {
        //Tc: O(r*c)  Sc: O(1)
        int r = grid.length;
        int c = grid[0].length;

        int ans = 0;
        int up, down, left, right;

        for(int row = 0; row < r; row++)
        {
            for(int col = 0; col < c; col++)
            {
                if(grid[row][col] == 1)
                {
                    if(row == 0) up = 0;
                    else up = grid[row-1][col];

                    if(row == r-1) down = 0;
                    else down = grid[row+1][col];

                    if(col == 0) left = 0;
                    else left = grid[row][col-1];

                    if(col == c-1) right = 0;
                    else right = grid[row][col+1];

                    ans += 4-(up+down+right+left);
                }
            }
        }
        return ans;
    }
}

