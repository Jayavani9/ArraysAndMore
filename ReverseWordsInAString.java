/*
151. Reverse Words in a String
Given an input string s, reverse the order of the words.

A word is defined as a sequence of non-space characters. The words in s will be separated by at least one space.

Return a string of the words in reverse order concatenated by a single space.

Note that s may contain leading or trailing spaces or multiple spaces between two words. The returned string should only have a single space separating the words. Do not include any extra spaces.

 
Example 1:
Input: s = "the sky is blue"
Output: "blue is sky the"
*/

class Solution {
    //Tc: O()
    public String reverseWords(String s) {
        String[] words = s.split(" ");
        //for(String w:words)
        //System.out.println(w);
        String res = new String(); 
        // StringBuffer res = new StringBuffer();
        for (int i = words.length - 1; i >= 0; i--) {
            // Condition to make sure that the empty spaces in
            //between are not considered and only words are
            //taken into account
           if (!words[i].isEmpty()) {
                res = res.concat(words[i]);
               //res.append(words[i]);
               // This conition is to make sure that the space is appended in between except for that last word.
                if (i > 0) {
                    res = res.concat(" "); 
                    //res.append(" ");
                }
            }
        }
        return res.trim();
        //return res.toString().trim();
    }
}
