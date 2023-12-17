670. Maximum Swap

You are given an integer num. You can swap two digits at most once to get the maximum valued number.

Return the maximum valued number you can get.

Example 1:

Input: num = 2736
Output: 7236
Explanation: Swap the number 2 and the number 7.
Example 2:

Input: num = 9973
Output: 9973
Explanation: No swap.

class Solution {
    public int maximumSwap(int num) {
        //Tc: O(n^2) Sc: O(n) where n = length of nums
        char[] numChar = Integer.toString(num).toCharArray();
        int maxNum = num;
        for(int i = 0 ; i < numChar.length; i++)
        {
            for(int j = i+1; j < numChar.length; j++)
            {
                char temp = numChar[i];
                numChar[i] = numChar[j];
                numChar[j] = temp;

                int swap = Integer.parseInt(new String(numChar));
                maxNum = Math.max(maxNum, swap);
                temp = numChar[i];
                numChar[i] = numChar[j];
                numChar[j] = temp;
            }
        }

        return maxNum;
        
    }
}

class Solution {
    //Tc: O(n) Sc: O(1)
    public int maximumSwap(int num) {
        char[] numChar = Integer.toString(num).toCharArray();
        int[] lastOccur = new int[10];
        for(int i = 0 ; i < numChar.length; i++)
        {
            lastOccur[numChar[i] - '0'] = i;
        }

        int i = 0;

        while(i < numChar.length)
        {
            for(int d = 9; d > numChar[i] - '0'; d--)
            {
                if(lastOccur[d] > i)
                {
                    char temp = numChar[i];
                    numChar[i] = numChar[lastOccur[d]];
                    numChar[lastOccur[d]] = temp;

                    return Integer.parseInt(new String(numChar));
                }
            }
            i++;
        }
 return num;
    }
}
