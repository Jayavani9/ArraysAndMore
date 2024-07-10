//https://www.geeksforgeeks.org/problems/triangle-and-square--170637/1?page=1&company=Microsoft&sortBy=latest


class Solution{
	int countSquare(int B){
		//Write your code here
    //Tc: O(n) Sc: O(1) 
		int ans = 0;
		while(B > 2)
		{
            ans += (B - 2)/2;
            B = B - 2;
		}
        return ans;       
	}
}
