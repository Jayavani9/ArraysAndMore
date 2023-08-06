The Fibonacci sequence is a series of numbers defined as follows: the first number of the sequence is 0, the second number is 1, and each subsequent number is the sum of the two preceding numbers. For example, the sequence starts as 0, 1, 1, 2, 3, 5, 8, and so on.

Write a function that takes an integer n as input and returns the nth Fibonacci number in the sequence.

Important note: In this question, the indexing of the Fibonacci sequence is slightly different. The first Fibonacci number is denoted as F0, the second number as F1, and so on. Therefore, calling getNthFib(1) should return F0, getNthFib(2) should return F1, and so forth.

Sample Input #1
n = 2
    
Sample Output #1
1 // 0, 1
    
Sample Input #2
n = 6
    
Sample Output #2
5 // 0, 1, 1, 2, 3, 5
    
class Program {
  public static int getNthFib(int n) {
    // Write your code here.
    if(n==0) return 0;
    else if(n==1) return 0;
    int[] ans= new int[n+1];
    ans[0] = 0;
    ans[1] = 1;
    for(int i = 2; i<= n ; i++)
    {
        ans[i] = ans[i-1] + ans[i-2];
    }
        return ans[n-1];
  }
}
