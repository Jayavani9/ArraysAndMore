//https://leetcode.com/problems/maximum-units-on-a-truck/

class Solution {
    //Tc: O(nlogn) Sc: O(1)
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        int ans = 0;
        Arrays.sort(boxTypes, (a,b) ->b[1] - a[1]);

         for (int[] box : boxTypes) {
            if (truckSize <= 0) {
                break;
            }

            int unit = Math.min(truckSize, box[0]);
            ans += unit * box[1];
            truckSize -= unit;
        }    
        return ans;
    }
}
