class Solution {
    public boolean isPowerOfTwo(int n) {
      if(n <= 0) return false;
      double lv = Math.log10(n) / Math.log10(2);
      return Math.floor(lv) == Math.ceil(lv);
        
    }
}
