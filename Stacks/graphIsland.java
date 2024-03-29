/**
Input: grid = [
  ["1","1","1","1","0"],
  ["1","1","0","1","0"],
  ["1","1","0","0","0"],
  ["0","0","0","0","0"]
]
Output: 1
**/
class Solution {
    public int numIslands(char[][] grid) {
        int row = grid.length;
        int col = grid[0].length;
        
        boolean[][] visited = new boolean[row][col];
        
        //Step 1 try to find the values which are 1 and set them as true in visited matx.
        int counter = 0;
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                
                if(grid[i][j] == '1' && visited[i][j] ==false){
                    counter ++;
                    helperDfs(i, j, row, col, grid, visited);
                }
            }
        }
        return counter;
        
    }
    
    public boolean exitCondition(int r, int c, int row, int col){
        if(r >= row || c >= col || r < 0 || c < 0) 
            return false;
        return true;
    }
    
    public void helperDfs(int r, int c, int row, int col, char[][] grid, boolean[][] visited){
        // Exit condition
        if(!exitCondition(r, c, row, col) || visited[r][c] == true || grid[r][c] == '0' ) return;
        
         visited[r][c] =true;
        
        int[] r1 = {0,0,-1,+1};  //left, right, top, bottom
        int[] c1 = {-1,+1,0, 0}; 
        
        for(int i = 0; i < r1.length; i++) {
            // calculate new row and column
            int nrow = r+r1[i];
            int ncol = c+c1[i];
            
            if(exitCondition(nrow, ncol, row, col) && (grid[nrow][ncol] == '1' ) && (visited[nrow][ncol] == false)){
               helperDfs(nrow, ncol, row, col, grid, visited);
            }
        }
    }
    
}
