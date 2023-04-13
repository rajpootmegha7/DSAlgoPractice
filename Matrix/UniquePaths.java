/**
There is a robot on an m x n grid. The robot is initially located at the top-left corner (i.e., grid[0][0]). 
The robot tries to move to the bottom-right corner (i.e., grid[m - 1][n - 1]). The robot can only move either down or right at any point in time.

Given the two integers m and n, return the number of possible unique paths that the robot can take to reach the bottom-right corner.

The test cases are generated so that the answer will be less than or equal to 2 * 109.
*/


class Solution {
    public int uniquePaths(int m, int n) {
        int [][]dp = new int [m][n];
        // Filling all the row values as 1
        for(int i = 0; i < dp.length;i++){
            dp[i][0] = 1;
        }
      //Filling the columns
        for(int j = 0; j< dp[0].length; j++){
            dp[0][j] = 1;
        }
      // filling rest of values based on row -1 + col -1 value.
        for(int k = 1; k<dp.length;k++){
            for(int l = 1; l < dp[0].length; l++){
                dp[k][l] = dp[k-1][l]+ dp[k][l-1];
            }
        }
      // return the last element of the matrix
        return dp[m-1][n-1];
    }
}
