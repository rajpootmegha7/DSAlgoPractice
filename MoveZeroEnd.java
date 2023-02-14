

class Solution {
    public void moveZeroes(int[] nums) {
        // Exit condition
        if(nums.length == 1) return;
        
        //Main logic
        int snowball = 0;
        for(int i = 0 ; i < nums.length; i++){
            if(nums[i]==0) snowball++;
            else if(snowball >0){
                // 0,1 we will swap one , when 1,0,0,3 - then we will swap two zero at once.
                int temp = nums[i];
                nums[i] = 0;
                nums[i-snowball]=temp;
            }
        }  
    }
}
