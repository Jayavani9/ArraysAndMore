Create a function that accepts a non-empty array of distinct integers and an integer representing a target sum. 
The function's purpose is to identify and return a two-dimensional array containing all the triplets from the input array that add up to the target sum. 
Each triplet should consist of three distinct numbers, and the numbers within each triplet should be in ascending order.
The triplets themselves should be ordered in ascending order based on the numbers they contain.

If no combination of three numbers from the array adds up to the target sum, the function should return an empty array.

Sample Input
array = [12, 3, 1, 2, -6, 5, -8, 6]
targetSum = 0
Sample Output
[[-8, 2, 6], [-8, 3, 5], [-6, 1, 5]]

class Program {
  public static List<Integer[]> threeNumberSum(int[] array, int targetSum) {
    // Write your code here.
    //
    Arrays.sort(array);
    int n = array.length;
    List<Integer[]> res = new ArrayList<>();
    for(int i = 0 ; i < n-2; i++)
    {
        int j = i + 1; 
        int k = n-1;
        while(j<k)
        {
            int ans = array[i] + array[j] + array[k];
            if(ans == targetSum)
            {
                Integer[] triplet = {array[i], array[j], array[k]};
                res.add(triplet);
            j ++;
            k --;
            }
            else if ( ans < targetSum) 
            {
                j++;
            }
            else k--;
        }
    }
    return res;
  }
}
