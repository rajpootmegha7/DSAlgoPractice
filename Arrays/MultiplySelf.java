// Input: nums = [1,2,3,4]
// Output: [24,12,8,6]


//Just store the left and right product (Try doing this with extra space first)
//This one is constant space because we are returning the array we created
//In first pass calculate the left product except self and in second calculate the right

class Solution {

    public int[] productExceptSelf(int[] nums) {
    
      int[] arr = new int[nums.length];
        
        //Base condition
        if(nums.length ==0) return arr;
        
        int right = 1, left = 1;
        for (int i = 0; i < nums.length; i++) {
            arr[i] = left;     // simply left values are stored
            left *= nums[i];
        }
        for (int i = nums.length - 1; i >= 0; i--) {
            arr[i] *= right;   // In right we will store the multiply
            right *= nums[i];   //Then multiply again
        }
        return arr;  
    }
}