/**
Input: nums = [3,0,1]
Output: 2
Explanation: n = 3 since there are 3 numbers, so all numbers are in the range [0,3]. 2 is the missing number in the range since it does not appear in nums.
*/

class Solution {
     public int missingNumber(int[] nums) {
        int rangeSum = 0, numsSum = 0;
        for (int i = 0; i < nums.length; i++) {
            numsSum += nums[i];
            rangeSum += i;
        }
        return (rangeSum + nums.length) - numsSum; // Added length because last digit is also required in range sum.
    }
}
