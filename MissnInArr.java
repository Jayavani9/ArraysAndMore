//https://www.geeksforgeeks.org/problems/missing-number-in-array1416/1?page=1&company=Amazon&sortBy=submissions

//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            String[] str = br.readLine().trim().split(" ");
            int[] arr = new int[n - 1];
            for (int i = 0; i < n - 1; i++) {
                arr[i] = Integer.parseInt(str[i]);
            }
            Solution sln = new Solution();
            System.out.println(sln.missingNumber(n, arr));
        }
    }
}
// } Driver Code Ends


// User function Template for Java
class Solution {
    //Tc: O(n) Sc: O(1)
    // Note that the size of the array is n-1
    int missingNumber(int n, int arr[]) {

        // Your Code Here
        int totSum = n*(n+1)/2;
        int sum = 0;
        
        for(int i = 0; i < arr.length; i++)
        {
            sum += arr[i];
        }
        
        return totSum-sum;
    }
}
