//https://leetcode.com/problems/minimum-area-rectangle/

class Solution {
    public int minAreaRect(int[][] points) {
        //Tc: O(n^2)  Sc: O(n) 
        HashSet<String> set = new HashSet<>();

        for(int[] p: points)
        {
            set.add(p[0]+","+p[1]);
        }

        int ans = Integer.MAX_VALUE;

        for(int i = 0; i < points.length; i++)
        {
            for(int j = i+1; j < points.length; j++)
            {
                int x1 = points[i][0];
                int x2 = points[j][0];
                int y1 = points[i][1];
                int y2 = points[j][1];

                if(x1 != x2 && y1 != y2)
                {
                    if(set.contains(x1 +"," + y2) && set.contains(x2 + ","+y1))
                    {
                        int area = Math.abs(x1-x2) * Math.abs(y1-y2);
                        ans = Math.min(ans, area);
                    }
                }
            }

        }
        if(ans == Integer.MAX_VALUE) return 0;
        else return ans;
    }
}
