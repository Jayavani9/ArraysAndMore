/*
28. Find the Index of the First Occurrence in a String
Given two strings needle and haystack, return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.

Example 1:
Input: haystack = "sadbutsad", needle = "sad"
Output: 0
Explanation: "sad" occurs at index 0 and 6.
The first occurrence is at index 0, so we return 0.
  
Example 2:
Input: haystack = "leetcode", needle = "leeto"
Output: -1
Explanation: "leeto" did not occur in "leetcode", so we return -1.
*/

class Solution {
    public int strStr(String haystack, String needle) {
        //Tc: O((hlen - nlen + 1) * nlen) and Sc: O(1)
        int hlen = haystack.length();
        int nlen = needle.length();
        if (nlen == 0) {
            return 0;
        }
        if (hlen < nlen) {
            return -1;
        }

        for (int i = 0; i <= hlen - nlen; i++) {
            boolean found = true;
            for (int j = 0; j < nlen; j++) {
                if (haystack.charAt(i + j) != needle.charAt(j)) {
                    found = false;
                    break;
                }
            }

            if (found) {
                return i; 
            }
        }

        return -1; 
    }
}
