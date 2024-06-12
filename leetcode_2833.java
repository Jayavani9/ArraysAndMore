2833. Furthest Point From Origin


https://leetcode.com/problems/furthest-point-from-origin/description/


class Solution {
    public int furthestDistanceFromOrigin(String moves) {
        int leftCnt = 0;
        int rightCnt = 0;
        int unknown = 0;

        for(int i = 0; i < moves.length(); i++)
        {
            char ch = moves.charAt(i);
            if(ch == 'L') leftCnt++;
            else if(ch == 'R') rightCnt++;
            else unknown++;
        }
        return Math.abs(leftCnt - rightCnt) + unknown;
    }
}
