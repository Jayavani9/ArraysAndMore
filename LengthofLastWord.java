/*
Given a string s consisting of words and spaces, return the length of the last word in the string.

A word is a maximal substring consisting of non-space characters only.
Example 1:
Input: s = "Hello World"
Output: 5
Explanation: The last word is "World" with length 5.
  
Example 2:
Input: s = "   fly me   to   the moon  "
Output: 4
Explanation: The last word is "moon" with length 4.
*/

/*
class Solution {
  //Tc: O(n+m) where n is the length of the String and m is the loop (no.of words in the input string) ; Sc: O(n)
    public int lengthOfLastWord(String s) {
        String[] w = s.split(" ");
        for(int i = 0 ; i < w.length;i++)
        {
        System.out.println(w[i]);
        }
        return w[w.length-1].length(); 

        
    }
}
*/

class Solution {
    //Tc: O(m+n) and Sc: O(n)
    public int lengthOfLastWord(String s) {
        String[] words = s.split(" ");
        int len = words.length;
        return words[len-1].length();
        
    }
}
