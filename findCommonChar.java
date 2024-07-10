//https://leetcode.com/problems/find-common-characters/

class Solution {
    public List<String> commonChars(String[] words) {
        //Tc: O(n*m) Sc: O(n*m)
        List<String> result = new ArrayList<>();
        for (char c = 'a'; c <= 'z'; c++) {
            int minCount = Integer.MAX_VALUE;
            
            for (String word : words) {
                int count = 0;
                for (int i = 0; i < word.length(); i++) {
                    if (word.charAt(i) == c) {
                        count++;
                    }
                }
                minCount = Math.min(minCount, count);
            }
            for (int i = 0; i < minCount; i++) {
                result.add(String.valueOf(c));
            }
        }
        return result;
    }
}
