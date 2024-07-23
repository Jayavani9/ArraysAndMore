//https://leetcode.com/problems/valid-sudoku/?envType=company&envId=nvidia&favoriteSlug=nvidia-three-months

class Solution {
    //Tc: O(1) Sc: O(1)
    public boolean isValidSudoku(char[][] board) {
        HashSet<String> seen = new HashSet<>();
        for(int i = 0; i < 9; i++)
        {
            for(int j = 0; j < 9; j++)
            {
                char ch = board[i][j];
                if(ch != '.')
                {
                if(!seen.add(ch + "row" + i)) return false;
                if(!seen.add(ch + "col" + j)) return false;
                if(!seen.add(ch + "box" + i/3 + j/3)) return false;
                }
            }
        } 
        return true;
    }
}

 
