//https://leetcode.com/problems/can-make-arithmetic-progression-from-sequence/description/

//Using Sort Method
class Solution {
    public boolean canMakeArithmeticProgression(int[] arr) {
        //Tc: O(nlogn)  Sc: O(logn) for in place sorting 
        Arrays.sort(arr);
        int d = arr[1] - arr[0];
        int n = arr.length;
        for(int i = 2; i < n; i++)
        {
            if(arr[i] - arr[i-1] != d) return false;
        }
        return true;
    }
}
