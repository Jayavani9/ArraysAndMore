//https://leetcode.com/problems/sum-of-square-numbers/description/

class Solution {
    public boolean judgeSquareSum(int c) {
        //Tc: O(sqrt(c)) Sc: O(1) 
        long a = 0;
        long b = (int)Math.sqrt(c);

        while(a <= b)
        {
            if(a*a + b*b == c) return true;
            if(a*a + b*b < c) a++;
            else b--;
        }
        return false;
    }
}
