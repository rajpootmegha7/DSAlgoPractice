/** 
Input: mat = [[1,2,3],
              [4,5,6],
              [7,8,9]]
Output: 25
Explanation: Diagonals sum: 1 + 5 + 9 + 3 + 7 = 25
Notice that element mat[1][1] = 5 is counted only once.
Example 2:

Input: mat = [[1,1,1,1],
              [1,1,1,1],
              [1,1,1,1],
              [1,1,1,1]]
Output: 8
    */
class Solution {
    public int diagonalSum(int[][] mat) { 
      int n = mat.length;
      int sum = 0;
      for(int i =0; i< n ; i++){
        sum += mat[i][i] + mat[i][n-1-i];
      }
      return n%2 == 1 ? sum =sum -mat[n/2][n/2] : sum;
    }
}
