//https://leetcode.com/problems/k-diff-pairs-in-an-array/

class Solution {
  
    public int findPairs(int[] nums, int k) {
        //Tc: O(n) Sc: O(n)
        Map<Integer, Integer> map = new HashMap<>();
        int cnt = 0;
        for(int num : nums){
            map.put(num, map.getOrDefault(num, 0)+1);
        }
        for(int key : map.keySet()){
            if(k == 0 && map.get(key) > 1){
                cnt++;
            }
            else if(k > 0 && map.containsKey(key + k)){
                cnt++;
            }
        }
        return cnt;
        
    }
}
