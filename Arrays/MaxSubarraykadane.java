
/**
Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
Output: 6
Explanation: The subarray [4,-1,2,1] has the largest sum 6.
*/
//.  Solution 1 - O(N^2)
class Solution {
    public int maxSubArray(int[] nums) {
        
        /**
        1.First take an arraylist where i will update the size of the array based on the maximum sum
        2.varible max sum , int min
        3. loop through the array and 
         */
        
        int max = Integer.MIN_VALUE;

        for(int i = 0; i < nums.length; i++){
            //int sum += nums[i];
            int newsum = 0;
            for(int j = i; j < nums.length; j++){
               newsum = newsum + nums[j];
                max = Math.max(max, newsum);
            }
        }
        return max;

    }
    // kadane algo 
    class Solution {
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        int max = Integer.MIN_VALUE, sum = 0;
        
        for(int i=0;i<n;i++){
            sum += nums[i];
            max = Math.max(sum,max);
            
            if(sum<0) sum = 0;
        }
        
        return max;
    }
}
  
 // Solution 2 - O(N) Kadane 's algorithm
    public int maxSubArray(int[] nums) {
         // Initialize our variables using the first element.
       int curr = nums[0];
       int max = nums[0];
        // Start from 2nd val
       for(int i = 1; i< nums.length; i++){
           // Add the nums in the curr
           int num = nums[i];
           curr = Math.max(num, curr+num);
         // Whichever is max keep it
           max = Math.max(curr, max);

       } 
       return max;
        
    }
}
