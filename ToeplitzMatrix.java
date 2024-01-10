Given an m x n matrix, return true if the matrix is Toeplitz. Otherwise, return false.

A matrix is Toeplitz if every diagonal from top-left to bottom-right has the same elements.


Input: matrix = [[1,2,3,4],[5,1,2,3],[9,5,1,2]]
Output: true
Explanation:
In the above grid, the diagonals are:
"[9]", "[5, 5]", "[1, 1, 1]", "[2, 2, 2]", "[3, 3]", "[4]".
In each diagonal all elements are the same, so the answer is True.

class Solution {
    public boolean isToeplitzMatrix(int[][] matrix) {
        //Tc: O(m*n) Sc: O(1)
        int m = matrix.length;
        int n = matrix[0].length;
        for(int i = 0; i < m-1; i++)
        {
            for(int j = 0; j < n-1; j++)
            {
                if(i < m && j < n && matrix[i][j] != matrix[i+1][j+1]) return false;
            }
        }
        return true;
    }
}
