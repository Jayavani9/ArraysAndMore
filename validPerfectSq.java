//https://leetcode.com/problems/valid-perfect-square/


//Bruteforce Solution 
//class Solution {
    public boolean isPerfectSquare(int num) {
      //Tc: O(sqrt(num)) Sc: O(1) 
        for (int i = 1; i <= num / i; i++) { 
        if (i * i == num) {
            return true;
        }
    }
    return false;
    }
}



//Using Binary Search 
class Solution {
    public boolean isPerfectSquare(int num) {
        //Tc: O(logn) Sc: O(1) 
        if (num < 1) return false; 
        long left = 1, right = num; 
        while (left <= right) {
            long mid = left + (right - left) / 2;
            long square = mid * mid;

            if (square == num) {
                return true;
            } else if (square < num) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return false;
    }
}
