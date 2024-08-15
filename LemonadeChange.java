//https://leetcode.com/problems/lemonade-change/

class Solution {
    public boolean lemonadeChange(int[] bills) {
        //Tc: O(n) Sc: O(1) 
        int fiveCnt = 0;
        int tenCnt = 0;

        for(int bill : bills)
        {
            if(bill == 5) fiveCnt++;
            else if(bill == 10){
                if(fiveCnt > 0) 
                {
                    fiveCnt--;
                    tenCnt++;
                }
                else return false;
            }
            else
            {
                if(fiveCnt > 0 && tenCnt > 0)
                {
                    tenCnt--;
                    fiveCnt--;
                }
                else if(fiveCnt >= 3)
                {
                    fiveCnt -= 3;
                }
                else return false;
            }
        }

        return true;
    }
}
