/**
Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.

Notice that the solution set must not contain duplicate triplets.

Input: nums = [-1,0,1,2,-1,-4]
Output: [[-1,-1,2],[-1,0,1]]

*/

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
    
         List<List<Integer>> out = new ArrayList<>();
        // Input: nums = [-1,0,1,2,-1,-4]
         for(int i = 0; i < nums.length - 2; i++ ){
             for(int j = i+1; j <nums.length - 1; j++){
                 for(int k = j+1; k < nums.length;k++){
                    
                     if(nums[k] + nums[j] + nums[i] == 0) {
                         List<Integer> list = new ArrayList<>();
                         list.add(nums[i]);
                         list.add(nums[j]);
                         list.add(nums[k]);
                         Collections.sort(list);
                         if(!out.contains(list)){
                             out.add(list);
                         }
                         
                     }
                 }
             }
         }

        out.forEach(s -> System.out.println(s));
        return out;
    }
}
