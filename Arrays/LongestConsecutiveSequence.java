
/**
Input: nums = [100,4,200,1,3,2]
Output: 4
Explanation: The longest consecutive elements sequence is [1, 2, 3, 4]. Therefore its length is 4.

class Solution {
*/

//Optimized solution 
public int longestConsecutive(int[] nums) {
        //Base condition
        if(nums.length == 0) return 0;
        if(nums.length == 1) return 1;
        
        Arrays.sort(nums);
        int max = 0;
        int count = 0;
        for(int i = 0; i < nums.length -1; i++){
            
            if(nums[i] == nums[i+1]) continue;
            else if(nums[i]+1 == nums[i+1]){
            count++;
            }
           else {
           //This is important when there are more than one consequetive sequence then we will return the max
                if(max < count) {
                    max = count;
                }
                count = 0; // Reset the count to 0 to store the new count.
            }
        }
        return Math.max(max+1, count+1);
    }


// Order of n2 solution.
    public int longestConsecutive(int[] nums) {
        //Base condition
        if(nums.length == 0) return 0;
        if(nums.length == 1) return 1;
        
        Arrays.sort(nums);
        int max = 0;
        
        for(int i = 0; i < nums.length; i++){
            int j = i;
            
            HashSet<Integer> hs = new HashSet<>();
            
            while(j < nums.length-1 && (nums[j]+1 == nums[j+1] || ( nums[j] == nums[j+1])) ){ // value of 1+1 = 2 or 1 = 1
                
                hs.add(nums[j]);  
                hs.add(nums[j+1]);  
                j++;   
            }
            i = j;
            max = Math.max(max, hs.size());
        }
        return max;
    }
        
}
