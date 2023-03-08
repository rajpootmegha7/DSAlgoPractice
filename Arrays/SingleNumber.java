/**
Example 1:

Input: nums = [2,2,1]
Output: 1
Example 2:

Input: nums = [4,1,2,1,2]
Output: 4


*/


class Solution {
    public int singleNumber(int[] nums) {
        /**
        I will create a hashmap and in front of each value i will add the occurance.
         */ 
        HashMap<Integer, Integer> hm = new HashMap<>();
        int count = 0;
        if(nums.length ==1) return 1;

        for(int i = 0; i < nums.length; i++){
             if(!hm.containsKey(nums[i])){
                 hm.put(nums[i], 1);
             } else {
                 int val = hm.get(nums[i]);
                 hm.put(nums[i], val+1);
             }
         }
        
        for (Map.Entry<Integer,Integer> entry: hm.entrySet()){
        if(entry.getValue() == 1){
            return entry.getKey();
        }
        }
        return count;
    }
}
