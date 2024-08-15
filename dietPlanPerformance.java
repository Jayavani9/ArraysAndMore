//https://leetcode.com/problems/diet-plan-performance/

//Sliding Window

class Solution {
    //Tc: O(n) Sc: O(1) 
    public int dietPlanPerformance(int[] calories, int k, int lower, int upper) {
        int ans = 0;
        int curSum = 0;

        for(int i = 0; i < calories.length; i++)
        {
            curSum += calories[i];
            if(i >= k) curSum -= calories[i-k];
            if(i >= k-1) {
                if(curSum < lower) ans--;
                if(curSum > upper) ans++;
            }
        }
        return ans;
    }
}


//BRUTEFORCE Solution
class Solution {
    //Tc: O(n^2) Sc: O(1) 
    public int dietPlanPerformance(int[] calories, int k, int lower, int upper) {
        int ans = 0;
        for(int i = 0; i <= calories.length-k; i++)
        {
            int sum = 0;
            for(int j = i; j < i+k; j++)
            {
                sum += calories[j];
            }
            if(sum < lower) ans--;
            if(sum > upper) ans++;
        }
        return ans;
    }
}
