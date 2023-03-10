class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<String> seen = new HashSet<>();
        for(int i = 0; i<9; i++){
            for(int j = 0; j< 9; j++){
                char curr_val = board[i][j];
                // It is important to check if the val is not blank.
                if(curr_val != '.'){
                    // then we are converting it into string and checking the values if not already present in hashset.
                    if(!seen.add(curr_val+"found in row"+ i)|| 
                    !seen.add(curr_val+"found in col"+j)||
                    !seen.add(curr_val+"found in sub box"+i/3+" - "+j/3)) return false;

                }
            }
        }
        return true;
    }
}
