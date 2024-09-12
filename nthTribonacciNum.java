//https://leetcode.com/problems/n-th-tribonacci-number/

class Solution {
    //Tc: O(n)  Sc: O(1)
    public int tribonacci(int n) {
        if(n == 0) return 0;
        if(n == 1 || n == 2) return 1;

        int a = 0, b = 1, c = 1;
        int ans = 0;

        for(int i = 3; i <=n; i++)
        {
            ans = a+b+c;
            a = b;
            b = c;
            c = ans;
        }
        return ans;
    }
}
