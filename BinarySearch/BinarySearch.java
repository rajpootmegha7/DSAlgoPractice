/**
 * Given an array of integers nums which is sorted in ascending order, and an integer target, write a function to search target in nums. If target exists, then return its index. Otherwise, return -1.

You must write an algorithm with O(log n) runtime complexity.

Input: nums = [-1,0,3,5,9,12], target = 9
Output: 4
Explanation: 9 exists in nums and its index is 4
 */


class Solution {
    public int search(int[] nums, int target) {
    int mid = nums.length /2;
    if(mid < target){
        for(int i = mid; i < nums.length-1; i++){
            if(nums[i]== target) return i;
        }
    } else {
        for(int i = 0; i < mid-1; i++){
            if(nums[i]== target) return i;
        }
    }  
    return -1;
    }
}