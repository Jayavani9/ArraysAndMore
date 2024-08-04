//https://leetcode.com/problems/max-points-on-a-line/

//Tc: O(n^2)  Sc: O(n) 
class Solution {
    public int maxPoints(int[][] points) {
        int n = points.length;

        if(n == 1) return 1;

        int ans = 0;

        for(int i = 0; i < n; i++)
        {
            Map<Double, Integer> map = new HashMap<>();
            for(int j = i+1; j < n; j++)
            {
                double m = slope(points[i], points[j]);
                map.put(m, map.getOrDefault(m,0)+1);
                ans = Math.max(ans, map.get(m));
            }
        }

        return ans+1;
    }

    private double slope(int[] p1, int[] p2)
    {
        int x1 = p1[0];
        int y1 = p1[1];

        int x2 = p2[0];
        int y2 = p2[1];

        if(x1 == x2) return Double.MAX_VALUE;
        if(y1 == y2) return 0;
        return (double)(y2-y1) /(double)(x2-x1);
    }
}

