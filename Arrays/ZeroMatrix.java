
//Given an m x n integer matrix matrix, if an element is 0, set its entire row and column to 0's.

class Solution {
    public void setZeroes(int[][] matrix) {
        int[] row_arr = new int[matrix.length];
        int[] col_arr = new int[matrix[0].length];
        
        for(int i = 0; i< matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                if(matrix[i][j] == 0){
                    row_arr[i] = 1;
                    col_arr[j] = 1;
                }
            }
            
        }
        setRowColumnZero(matrix, row_arr, col_arr);
        
    }
    public void setRowColumnZero(int[][] matrix, int[] row, int[] col){
        for(int i = 0; i< row.length; i++){
            if(row[i]==1){
                for( int j = 0; j < matrix[0].length; j++){
                    matrix[i][j] = 0;
                }
            }
        }
        for(int i = 0;  i < col.length; i++){
            if(col[i]== 1){
                for( int j = 0; j< matrix.length; j++){
                  matrix[j][i] = 0;  
                }
            }
        }
    }
}
