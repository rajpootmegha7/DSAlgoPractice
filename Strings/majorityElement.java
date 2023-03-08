/**Given an array nums of size n, return the majority element.

The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.

 

Example 1:

Input: nums = [3,2,3]
Output: 3


*/



class Solution {
    public int majorityElement(int[] nums) {
        /**
        The way I am trying to look at this problem is hashmap
        feed and get the occurance saved
        then if condition and if it matches then return */
        HashMap<Integer, Integer> hm = new HashMap<>();
        int n = nums.length/2;
      
        for(int i: nums){
            if(!hm.containsKey(i)){
                hm.put(i,1);
            } else{
                int val = hm.get(i);
                hm.put(i,val+1);
            }
        }

        for( Map.Entry<Integer, Integer> entry: hm.entrySet()){
            if(entry.getValue() > n) return entry.getKey();
        }
        return 0;
    }
}
