//https://www.geeksforgeeks.org/problems/josephus-problem/1?page=1&company%5B%5D=Amazon&category%5B%5D=Recursion&sortBy= 

class Solution
{
   public int josephus(int n, int k)
    {
        //Your code here
        //tc: O(n) Sc: O(1)
        if(n == 1) return 1;
        
        else
        {
            return (josephus(n-1,k)+k-1)%n+1;
        }
    }

}
