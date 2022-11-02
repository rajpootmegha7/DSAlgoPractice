/**
Given an array Arr of N positive integers, find K largest elements from the array.  The output elements should be printed in decreasing order.

Example 1:
Input:
N = 5, K = 2
Arr[] = {12, 5, 787, 1, 23}
Output: 787 23
Explanation: 1st largest element in the
array is 787 and second largest is 23.

*/
class Solutions {
      int[] kLargest(int[] arr, int n, int k) {
      
      int max, index = 0; count = 0;
      int[] op = new int[n];
      
      while(k > 0){
             max = Integer.MIN_VALUE;
             for(int i = 0; i < n; i++){
                   if(max < arr[i]){. // Or in one line Math.max(max, arr[i]);
                         max = arr[i];
                         index = i;   // storing this index so that replace the highest to find next highest element.
                               }
                   arr[index] = -1;
                   op[count++] = max;
                   k--;
                  }
       return op;
       }
     }
       
}
