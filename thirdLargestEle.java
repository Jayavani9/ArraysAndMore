//https://www.geeksforgeeks.org/problems/third-largest-element/1?page=1&company=Microsoft&sortBy=latest


//Using pointers and updation
class Solution {
    int thirdLargest(int arr[]) {
        // Your code here
        //Tc: O(n) Sc: O(1)
        int p1 = Integer.MIN_VALUE;
        int p2 = Integer.MIN_VALUE;
        int p3 = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i] > p1)
            {
                p3 = p2;
                p2 = p1;
                p1 = arr[i];
            }
            else if(arr[i] > p2)
            {
                p3 = p2;
                p2 = arr[i];
            }
            else if(arr[i] > p3)
            {
                p3 = arr[i];
            }
        }
        return p3;
    }
}

//Using sort
class Solution {
    int thirdLargest(int arr[]) {
        // Your code here
        //Tc: O(nlogn) Sc: O(1)
        int n = arr.length;
        Arrays.sort(arr);
        if(arr.length < 3) return -1;
        return arr[n-3];
    }
}
