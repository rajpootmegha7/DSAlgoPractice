/**
Input: n = 2
Output: 2
Explanation: There are two ways to climb to the top.
1. 1 step + 1 step
2. 2 steps
*/

class Solution {
    public int climbStairs(int n) {
        // Base cases
        if(n == 1 || n == 2) return n;
        // Main logic if the no. of ways for 3rd step = ways at step 2 + ways at step 1;
        // This way if step n = step n -1 + step n-2;
        int [] dp = new int[n];
        dp[0] = 1;
        dp[1] = 2;
        
        // Now for the remaining steps we will loop through
        for(int i = 2; i < n; i++ ){
            dp[i] = dp[i-1] + dp[i-2];
        }
        
        return dp[n-1];
    }
}
