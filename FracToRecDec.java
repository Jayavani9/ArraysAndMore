166. Fraction to Recurring Decimal

Given two integers representing the numerator and denominator of a fraction, return the fraction in string format.

If the fractional part is repeating, enclose the repeating part in parentheses.

If multiple answers are possible, return any of them.

It is guaranteed that the length of the answer string is less than 104 for all the given inputs.

 

Example 1:

Input: numerator = 1, denominator = 2
Output: "0.5"
Example 2:

Input: numerator = 2, denominator = 1
Output: "2"
Example 3:

Input: numerator = 4, denominator = 333
Output: "0.(012)"

class Solution {
    //Tc : O(N) Sc: O(N)
    public String fractionToDecimal(int num, int den) {
        if(num == 0) return "0";
        StringBuilder res = new StringBuilder();
        if(num < 0 ^ den < 0) res.append("-");

        long dividend = Math.abs(Long.valueOf(num));
        long divisor = Math.abs(Long.valueOf(den));

        res.append(String.valueOf(dividend/divisor));

        long rem = dividend % divisor;

        if(rem == 0) return res.toString();

        res.append(".");

        Map<Long, Integer> map = new HashMap<>();

        while(rem != 0)
        {
            if(map.containsKey(rem))
            {
                res.insert(map.get(rem), "(");
                res.append(")");
                break;
            }

            map.put(rem, res.length());
            rem *= 10;
            res.append(String.valueOf(rem/divisor));
            rem %= divisor;
        }

        return res.toString();
    }
}
