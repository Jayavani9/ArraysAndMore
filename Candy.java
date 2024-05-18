/*
135. Candy

There are n children standing in a line. Each child is assigned a rating value given in the integer array ratings.

You are giving candies to these children subjected to the following requirements:

Each child must have at least one candy.
Children with a higher rating get more candies than their neighbors.
Return the minimum number of candies you need to have to distribute the candies to the children.

Example 1:
Input: ratings = [1,0,2]
Output: 5
Explanation: You can allocate to the first, second and third child with 2, 1, 2 candies respectively.
  
Example 2:
Input: ratings = [1,2,2]
Output: 4
Explanation: You can allocate to the first, second and third child with 1, 2, 1 candies respectively.
The third child gets 1 candy because it satisfies the above two conditions.
*/

//using forward and backward pass solution
class Solution {
    //Tc: O(n) and Sc: O(n)
    public int candy(int[] ratings) {
            if(ratings == null || ratings.length == 0) return 0;
        int len = ratings.length;
        int ans = 0;
        if(len==1) return 1;
        int res[] = new int[len];
        Arrays.fill(res,1);
        //forward pass
        for(int i = 1 ; i < len; i++)
        {
            if(ratings[i] > ratings[i-1])
            {
                res[i] = res[i-1] +1;
            }
        }
        //backward pass
        for(int i = len-2; i >= 0 ; i--)
        {
            if(ratings[i] > ratings[i+1])
            {
                res[i] = Math.max(res[i], 1 + res[i+1]);
            }
        }
        for(int i = 0 ; i < len; i++)
        {
            ans  = ans + res[i];
        }

        return ans;
    }
}
