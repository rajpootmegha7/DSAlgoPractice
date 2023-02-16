// Input: nums = [1,2,3,4]
// Output: [24,12,8,6]



//Easy Solution  I : O(n)

class Solution {
    public int[] productExceptSelf(int[] nums) {
        /*
        use the prefix and sufix using two array left and right and answer
       */
       int[] answer = new int[nums.length];
       int[] left = new int[nums.length];
       int[] right = new int[nums.length];

       // Store the left most prefix as 1;
       left[0] = 1;
       for(int i = 1; i< nums.length; i++){
           left[i] = left[i-1] * nums[i-1]; //1*1, 1*2,2*3,6*4
       }
       right[nums.length -1] = 1;
       for(int j = nums.length - 2; j >= 0; j--){
           right[j] = right[j+1]* nums[j+1]; // 24*1,12*2,4*3,1*4 
       }

       for(int k = 0; k < nums.length; k++){
           answer[k] = left[k]* right[k];
       }
        return answer;

    }
}

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
