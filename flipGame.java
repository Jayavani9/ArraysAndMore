//https://leetcode.com/problems/flip-game/description/

class Solution {
    public List<String> generatePossibleNextMoves(String currentState) {
      //Tc: O(n^2)  Sc: O(1) 
        List<String> ans = new ArrayList<>();
        if(currentState.length() == 1) return ans;

        for(int i = 0; i < currentState.length() - 1; i++)
        {
            if(currentState.charAt(i) == '+' && currentState.charAt(i+1) == '+')
            {
                String ns = currentState.substring(0, i) + "--" + currentState.substring(i+2);
                ans.add(ns);
            }
        }
        return ans;
    }
}
