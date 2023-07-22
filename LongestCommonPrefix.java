14. Longest Common Prefix
Write a function to find the longest common prefix string amongst an array of strings.
If there is no common prefix, return an empty string "".
Example 1:
Input: strs = ["flower","flow","flight"]
Output: "fl"

class Solution {
    public String longestCommonPrefix(String[] strs) {
         if (strs == null || strs.length == 0) {
            return "";
        }

        String baseString = strs[0];
        StringBuilder prefix = new StringBuilder();

        for (int i = 0; i < baseString.length(); i++) {
            char ch = baseString.charAt(i);
            for (int j = 1; j < strs.length; j++) {
                if (i >= strs[j].length() || ch != strs[j].charAt(i)) {
                    return prefix.toString();
                }
            }
            prefix.append(ch);
        }

        return prefix.toString();

        
    }
}
