//https://leetcode.com/problems/number-of-1-bits/description/

class Solution {
    public int hammingWeight(int n) {
        //Tc: O(n) Sc: O(1) 
        int ans = 0;
        while (n != 0) {
            ans++;
            n &= (n - 1);
        }
            return ans;
    }
}
