//https://leetcode.com/problems/rectangle-area/



class Solution {
    //Tc: O(1) Sc: O(1) 
    public int computeArea(int ax1, int ay1, int ax2, int ay2, int bx1, int by1, int bx2, int by2) {
        
        int areaA = (ax2-ax1) * (ay2-ay1);
        int areaB = (bx2-bx1) * (by2-by1);

        int overLapX = Math.min(ax2,bx2) - Math.max(ax1, bx1);

        int overLapY = Math.min(ay2, by2) - Math.max(ay1, by1);

        int totOverLap = 0;

        if(overLapX > 0 && overLapY > 0)
        {
            totOverLap = overLapX * overLapY;
        }

        int res = areaA + areaB - totOverLap;

        return res;
    }
}
