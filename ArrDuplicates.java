//https://www.geeksforgeeks.org/problems/find-duplicates-in-an-array/

class Solution {
    public static ArrayList<Integer> duplicates(int[] arr) {
        // code here
        //Tc: O(n)  Sc: O(n) 
        ArrayList<Integer> ans = new ArrayList<Integer>();
        
        int[] cntr = new int[arr.length];
        
        for(int i = 0; i < arr.length; i++)
        {
            cntr[arr[i]]++;
        }
        
        for(int i = 0; i < cntr.length; i++)
        {
            if(cntr[i] > 1) ans.add(i);
        }
        if(ans.size() == 0) ans.add(-1);
        return ans;
    }
}

