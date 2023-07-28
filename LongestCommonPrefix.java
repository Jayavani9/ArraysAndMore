/*
14. Longest Common Prefix
Write a function to find the longest common prefix string amongst an array of strings.
If there is no common prefix, return an empty string "".
Example 1:
Input: strs = ["flower","flow","flight"]
Output: "fl"
*/

class Solution {
    //Tc: O(m*n) and Sc: O(1)
    public String longestCommonPrefix(String[] strs) {
       if (strs == null || strs.length == 0) {
            return "";
        }

        StringBuilder lcp = new StringBuilder();
        for (int i = 0; i < strs[0].length(); i++) {
            char ch = strs[0].charAt(i);
            for (int j = 1; j < strs.length; j++) {
                if (i >= strs[j].length() || strs[j].charAt(i) != ch) {
                    return lcp.toString();
                }
            }
            lcp.append(ch);
        }
        return lcp.toString();
        
    }
}
