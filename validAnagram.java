242. Valid Anagram

Given two strings s and t, return true if t is an anagram of s, and false otherwise.

An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.

Example 1:

Input: s = "anagram", t = "nagaram"
Output: true
Example 2:

Input: s = "rat", t = "car"
Output: false

class Solution {
    public boolean isAnagram(String s, String t) {
        //Tc: O(m+n) and Sc: O(1) 
        if(s.length() != t.length()) return false;
        if(s.length() == 0|| t.length() == 0 || s == null || t == null) return false;
        int arr[] = new int[26];
        for(int i = 0 ; i < s.length(); i++)
        {
            char cs = s.charAt(i);
            char ct = t.charAt(i);
            arr[cs -'a']++;
            arr[ct-'a']--;
        }
        for(int i:arr)
        {
            if(i != 0) return false;
        }
        /*
        char[] s1 = s.toCharArray();
        char[] s2 = t.toCharArray();

        Arrays.sort(s1);
        Arrays.sort(s2);

        return Arrays.equals(s1,s2);
        */
        return true;
    }
}
/*
  if(s.length() != t.length()) return false;

        int[] cntr = new int[26];
        for(int i = 0; i < s.length(); i++)
        {
            cntr[s.charAt(i) - 'a']++;
            cntr[t.charAt(i)-'a']--;
        }
        for(int i = 0 ; i < cntr.length;i++)
        {
            if(cntr[i] != 0) return false;
        }

        return true;


 /*
        char s1[] = s.toCharArray();
        char s2[] = t.toCharArray();

        Arrays.sort(s1);
        Arrays.sort(s2);

        return Arrays.equals(s1,s2);
        */
