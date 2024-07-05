//https://leetcode.com/problems/minimum-adjacent-swaps-to-make-a-valid-array/

//Tc: O(n) Sc: O(1)
class Solution {
    public int minimumSwaps(int[] nums) {
        int n = nums.length;
        if (n <= 1) return 0;

        int minIndex = 0;
        int maxIndex = 0;
        for (int i = 1; i < n; i++) {
            if (nums[i] < nums[minIndex]) {
                minIndex = i;
            }
        }
        for (int i = 1; i < n; i++) {
            if (nums[i] >= nums[maxIndex]) {
                maxIndex = i;
            }
        }

        int swaps = minIndex + (n - 1 - maxIndex);
        if (minIndex > maxIndex) {
            swaps--;
        }
        return swaps;
    }
}
