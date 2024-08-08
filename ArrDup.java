#https://www.geeksforgeeks.org/problems/find-duplicates-in-an-array/1?page=1&company%5B%5D=Amazon&curated%5B%5D=2&sortBy=

//{ Driver Code Starts
import java.io.*;
import java.util.*;

class IntArray {
    public static int[] input(BufferedReader br, int n) throws IOException {
        String[] s = br.readLine().trim().split(" ");
        int[] a = new int[n];
        for (int i = 0; i < n; i++) a[i] = Integer.parseInt(s[i]);

        return a;
    }

    public static void print(int[] a) {
        for (int e : a) System.out.print(e + " ");
        System.out.println();
    }

    public static void print(ArrayList<Integer> a) {
        for (int e : a) System.out.print(e + " ");
        System.out.println();
    }
}

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while (t-- > 0) {

            int n;
            n = Integer.parseInt(br.readLine());

            int[] arr = IntArray.input(br, n);

            Solution obj = new Solution();
            ArrayList<Integer> res = obj.duplicates(arr);

            IntArray.print(res);
        }
    }
}

// } Driver Code Ends

//Using a counter

class Solution {
    public static ArrayList<Integer> duplicates(int[] arr) {
        //Tc: O(n) Sc: O(n)
        // code here
        int n = arr.length;
        ArrayList<Integer> ans = new ArrayList<>();
        int[] cntr = new int[n];
        
        for(int i = 0; i < n; i++)
        {
            cntr[arr[i]]++;
        }
        
        for(int i = 0; i < n; i++)
        {
            if(cntr[i] > 1) ans.add(i);
        }
        
        if(ans.isEmpty()) ans.add(-1);
        return ans;
    }
}
