/** Given an integer n, return true if it is a power of three. Otherwise, return false.

An integer n is a power of three, if there exists an integer x such that n == 3x.

 

Example 1:

Input: n = 27
Output: true
Explanation: 27 = 33
*/

class Solution {
    /**
    The condition n > 0 is used to make sure that we only check for positive integers.
We check if 3 raised to the power of 19 is divisible by n. Why 19? Because 3**19 is the largest power of 3 that can fit into the integer range (2^31 - 1).
If n is a power of 3, then it must be a divisor of 319 and thus the remainder of 319 / n will be 0. If it's not a power of 3, then it won't be a divisor and the remainder will be non-zero.
Therefore, we return True if n is greater than 0 and 3**19 % n is equal to 0, and False otherwise.
     */
public boolean isPowerOfThree(int n) {
    // 1162261467 is 3^19,  3^20 is bigger than int  
    return ( n>0 &&  1162261467%n==0);
}
}
