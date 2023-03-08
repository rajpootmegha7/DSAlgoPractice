
Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
Output: [1,2,2,3,5,6]
Explanation: The arrays we are merging are [1,2,3] and [2,5,6].
The result of the merge is [1,2,2,3,5,6] with the underlined elements coming from nums1.

class Solution {
     /**
     * 1. run all pointer from the end.     // i[1,2,6,,0,0,0,0,]k / j[4,5,3]
     *  loop will end when j is less then o.
     * if i > j then add i at the array end.
     * else add j at the array end.
      */ 
       
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // i[1,2,6,,0,0,0,0,]k / j[4,5,3]
       
        int k = m+n-1;
        int j = n-1;
        int i = m-1;
        while (j >= 0){
            
            if(i >=0 && nums1[i]>nums2[j]){
                nums1[k--] = nums1[i--];
              
            } else { 
                nums1[k--] = nums2[j--];
               
            }
           
        }
    }
}
