//https://leetcode.com/problems/first-bad-version/description/


/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

//Binary Search 
//Tc: O(logn) 
public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int l = 1;
        int r = n;
        while(l < r)
        {
            int mid = l + (r-l)/2;
            if(isBadVersion(mid)) r = mid;
            else l = mid+1;
        }
        return l;
    }
}


//Linear Search 
//Tc: O(n) 
/*
 for(int i = 1; i < n; i++)
        {
            if(isBadVersion(i)) return i;
        }

        return n;

        */
