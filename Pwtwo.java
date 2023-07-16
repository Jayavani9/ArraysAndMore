class Solution {
    //Tc: O(1) and Sc: O(1)
    //Solution using bitCount 
    //Ex : 8 can be denoted as 2^3 and it takes 1 at 2^3 in the system. So 1 will be the bitCount
    // Thus, if the bitcount is 1, that means it is exactly a power of 2
    public boolean isPowerOfTwo(int n) {
      return n > 0 && Integer.bitCount(n) == 1;
        
    }
}

/*
 Using Logarithmic solution 
 return n > 0 && Math.log(n) / Math.log(2) % 1 == 0;
But this do not workn for n =536870912
Reason : Due to floating-point precision issues.

We can try checking like this by introducing epsilon and works if wants to use a log solution.
 double logValue = Math.log(n) / Math.log(2);
    double epsilon = 1e-10;  // Small epsilon value for floating-point comparison

    return n > 0 && Math.abs(logValue - Math.round(logValue)) < epsilon;
 */