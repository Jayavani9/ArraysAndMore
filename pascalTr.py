//https://www.geeksforgeeks.org/problems/pascal-triangle0652/1?page=1&company%5B%5D=Amazon&category%5B%5D=Recursion&sortBy=

class Solution:
  #tc: O(n^2) sc: O(n^2)
	def nthRowOfPascalTriangle(self,n):
	    # code here
	    MOD = 10**9 + 7
	    
	    if n==1:
	        return [1]
	        
	    elif n == 2:
	        return [1,1]
	        
	    cur = [1]
	    
	    for i in range(1,n):
	        nr = [1]
	        for j in range(1, len(cur)):
	            nr.append((cur[j-1] + cur[j])%MOD)
	        
	        nr.append(1)
	        cur = nr
	        
	    return cur
