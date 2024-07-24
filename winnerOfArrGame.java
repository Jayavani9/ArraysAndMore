//https://leetcode.com/problems/find-the-winner-of-an-array-game/

class Solution {
    //Tc: O(n)  Sc: O(1)
    public int getWinner(int[] arr, int k) {
        int cnt = 0;
        int n = arr.length;
        int ans = arr[0];

        for(int i = 1; i < n; i++)
        {
            if(arr[i] > ans)
            {   
                ans = arr[i];
                cnt = 1;
            }
            else cnt++;
            if(cnt == k) return ans;
        }
        return ans;
    }
}
