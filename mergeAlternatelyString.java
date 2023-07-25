/*
1768. Merge Strings Alternately
You are given two strings word1 and word2. Merge the strings by adding letters in alternating order,
starting with word1. If a string is longer than the other, append the additional letters onto the end of the merged string.
Return the merged string.
*/


class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder merged = new StringBuilder();
        int minLen = Math.min(word1.length(), word2.length());
        
        for (int i = 0; i < minLen; i++) {
            merged.append(word1.charAt(i)).append(word2.charAt(i));
        }
        
        if (word1.length() > minLen) {
            merged.append(word1.substring(minLen));
        } else if (word2.length() > minLen) {
            merged.append(word2.substring(minLen));
        }
        
        return merged.toString();
         
    }
}
