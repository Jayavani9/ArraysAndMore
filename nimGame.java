//https://leetcode.com/problems/nim-game/description/

class Solution {
    public boolean canWinNim(int n) {
        //Tc: O(1) Sc: O(1) 
        return (n%4 != 0);
    }
}
