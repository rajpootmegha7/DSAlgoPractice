
/**
Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
*/

class Solution {
  
    //sol 1 : Solve it using hashmap method using two loops
  
    public int[] twoSum(int[] nums, int target) {
       HashMap<Integer, Integer> prevMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            int diff = target - num;

            if (prevMap.containsKey(nums[i])) {
                return new int[] { prevMap.get(num), i };
            }

            prevMap.put(diff, i);
        }

        return new int[] {};
    }
    
    }
