//https://leetcode.com/problems/koko-eating-bananas/

class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        //Tc: O(nlogm) Sc: O(1) 
        int left = 1; 
        int right = 1;

        for(int pile : piles) {
            right = Math.max(right, pile);
        }  

        while(left <= right) {
            int mid = left + (right - left) / 2;
            int time = 0;

            for(int pile : piles) {
                time += Math.ceil((double)pile / mid);
            }

            if(time <= h) right = mid - 1;
            else left = mid + 1;
        }

        return left; 
        
    }
}
