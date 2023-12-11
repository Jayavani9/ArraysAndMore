4. Median of Two Sorted Arrays
  
Given two sorted arrays nums1 and nums2 of size m and n respectively, 
return the median of the two sorted arrays.

The overall run time complexity should be O(log (m+n)).

Example 1:

Input: nums1 = [1,3], nums2 = [2]
Output: 2.00000
Explanation: merged array = [1,2,3] and median is 2.
Example 2:

Input: nums1 = [1,2], nums2 = [3,4]
Output: 2.50000
Explanation: merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5.

Solution:

1. Solution using two pointers
class Solution:
    //Tc: O(m+n) and Sc: O(m+n)
    def findMedianSortedArrays(self, nums1: List[int], nums2: List[int]) -> float:
      ans = []
      m = len(nums1)
      n = len(nums2)
      p1,p2 = 0,0
      while(p1 < m and p2 < n):
        if(nums1[p1] > nums2[p2]):
          ans.append(nums2[p2])
          p2 += 1
        else:
          ans.append(nums1[p1])
          p1 += 1
      if(p1 < m):
        for k in range(p1,m):
          ans.append(nums1[k])
      if(p2 < n):
        for m in range(p2,n):
          ans.append(nums2[m])
      ans_len = len(ans)
      if(ans_len%2 == 0):
            med = (ans[ans_len//2-1] + ans[ans_len//2])/2.0
      else:
            med = ans[ans_len//2]

      return med
'''
Solution using sorting
//Tc: O(m+n(log(m+n)) and Sc: O(1)
        nums1 = nums1 + nums2
        n = len(nums1)
        nums1.sort()
        if(n%2 == 0):
            med = (nums1[n//2-1] + nums1[n//2])/2.0
        else:
            med = nums1[n//2]

        return med
'''
