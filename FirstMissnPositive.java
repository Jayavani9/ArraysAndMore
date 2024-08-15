//https://leetcode.com/problems/first-missing-positive/?envType=daily-question&envId=2024-08-15

//Using a HashSet


class Solution {
    public int firstMissingPositive(int[] nums) {
        //Tc: O(n) Sc: O(n) 
        HashSet<Integer> set = new HashSet<>();
        for(int i : nums)
        {
            if(i > 0) set.add(i);
        }

        int i = 1;
        while(true)
        {
            if(!set.contains(i)) return i;
            i++;
        }
    }
}


//Sorting Solution
class Solution {
    public int firstMissingPositive(int[] nums) {
        //Tc: O(nlogn) Sc: O(1) 
        Arrays.sort(nums);
        int ans = 1;
        for(int n: nums)
        {
            if(ans == n) ans++;
        }   
          return ans;
    }
}


