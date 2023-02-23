/**
Input: nums = [3,2,2,3], val = 3
Output: 2, nums = [2,2,_,_]
Explanation: Your function should return k = 2, with the first two elements of nums being 2.
It does not matter what you leave beyond the returned k (hence they are underscores).
*/

class Solution {
    public int removeElement(int[] nums, int val) {
        // Base cases
        if(nums.length == 0) return 0;
        // Main logic
        int count = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != val){
                int temp = nums[count];
                nums[count] = nums[i];
                nums[i] = temp;
                count++;
            }
        }
       return count;

    }

}
