/*
9. Palindrome Number
Given an integer x, return true if x is a 
palindrome
, and false otherwise.

Example 1:

Input: x = 121
Output: true
Explanation: 121 reads as 121 from left to right and from right to left.
Example 2:

Input: x = -121
Output: false
Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
*/
 -- Using String Conversion
class Solution {
   //Tc : O(n)
    public boolean isPalindrome(int x)
    {
        String xs = Integer.toString(x);
        int i = 0;
        int j = xs.length() - 1;
        while(i <= j)
        {
            if(xs.charAt(i) != xs.charAt(j)) return false;
            i++;
            j --;

        }
        return true;
        
    }
}

-- Using Reverse 
class Solution {
    public boolean isPalindrome(int x)
    {
        int rev = 0;
        int num = x;
        int r;
        while(num > 0)
        {
            r = num%10;
            rev = rev * 10 + r;
            num = num/10;
        }
        if(x == rev) return true;
        else return false;
    }

}
