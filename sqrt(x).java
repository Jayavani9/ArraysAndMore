69. Sqrt(x)
  
Given a non-negative integer x, return the square root of x rounded down to the nearest integer. 
The returned integer should be non-negative as well.
You must not use any built-in exponent function or operator.
For example, do not use pow(x, 0.5) in c++ or x ** 0.5 in python.

Example 1:
Input: x = 4
Output: 2
Explanation: The square root of 4 is 2, so we return 2.
  
Example 2:
Input: x = 8
Output: 2
Explanation: The square root of 8 is 2.82842..., and since we round it down to the nearest integer, 2 is returned.

  
class Solution {
    // Tc:O(sqrt(x)) and Sc: O(1)
    public int mySqrt(int x) {
        long y = 0;
        while(y*y <= x) y++;
        return (int)y-1;
    }
}

class Solution {
    //Tc: O(log x) and Sc: O(1)
    public int mySqrt(int x) {
        if (x <= 1) return x;
        
        long left = 1;
        long right = x;
        long result = 0;
        
        while (left <= right) {
            long mid = left + (right - left) / 2;
            long square = mid * mid;
            
            if (square == x) {
                return (int) mid;
            } else if (square < x) {
                left = mid + 1;
                result = mid; // Keep track of the potential result
            } else {
                right = mid - 1;
            }
        }
        
        return (int) result;
    }
}

