//https://leetcode.com/explore/interview/card/top-interview-questions-easy/102/math/745/

class Solution {
    public boolean isPowerOfThree(int n) {
         if (n <= 0) {
            return false;
        }
        while (n % 3 == 0) {
            n /= 3;
        }
        return n == 1;
    }
}
