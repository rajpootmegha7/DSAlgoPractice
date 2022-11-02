/**
Given two integer arrays nums1 and nums2, return an array of their intersection. 
Each element in the result must appear as many times as it shows in both arrays and you may return the result in any order.

Example 1:

Input: nums1 = [1,2,2,1], nums2 = [2,2]
Output: [2,2]
Example 2:

Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
Output: [4,9]
Explanation: [9,4] is also accepted.
*/
class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        
      // Not sure about base conditions here
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        
        List<Integer> ls = new ArrayList<>();
        int i = 0, j = 0;
        while( i< nums1.length && j < nums2.length){
            
            if(nums1[i] == nums2[j]){
                
                ls.add(nums1[i]);
                i++;
                j++;
                continue;
            }
            if(nums1[i] > nums2[j]) j++;
            else i++;
        }
        
        int[] out = new int[ls.size()];
        int k = 0;
        
        for(Integer x : ls){
            out[k++] = x;
        }
        return out;
        
    }
}
