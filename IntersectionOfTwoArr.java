//https://leetcode.com/problems/intersection-of-two-arrays/?envType=company&envId=nvidia&favoriteSlug=nvidia-three-months


//Tc: O(m+n) Sc: O(m)
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
       HashSet<Integer> h1 = new HashSet<>();
       HashSet<Integer> ans = new HashSet<>();

        for(int num : nums1) {
            h1.add(num);
        }

        for(int num : nums2) {
            if(h1.contains(num)) {
                ans.add(num);
            }
        }

        int[] res = new int[ans.size()];
        int i = 0;
        for(int num : ans) {
            res[i++] = num;
        }

        return res;
    }
}
