/**
Given an array of distinct integers arr, find all pairs of elements with the minimum absolute difference of any two elements.

Return a list of pairs in ascending order(with respect to pairs), each pair [a, b] follows

a, b are from arr
a < b
b - a equals to the minimum absolute difference of any two elements in arr

Example 1:
Input: arr = [4,2,1,3]
Output: [[1,2],[2,3],[3,4]]

Explanation: The minimum absolute difference is 1. List all pairs with difference equal to 1 in ascending order.
*/

class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
       
        Arrays.sort(arr);
        int min_diff = getMinimumAbDiff(arr);
        
        List<List<Integer>> pairs = getPairs(arr, min_diff);
        return pairs;
    }
   
    public int getMinimumAbDiff(int[] arr){
        int min = Integer.MAX_VALUE;
        
        for(int i = 0; i < arr.length - 1 ; i++ ){
           int temp_min = (arr[i+1] - arr[i]);
            
            if (temp_min < min) 
                min = temp_min;
        }
        return min;
    }
    
    public List<List<Integer>> getPairs(int[] arr, int diff){
        List<List<Integer>> op = new ArrayList<>();
        
        for(int i=0; i < arr.length -1; i++){
           
            if((arr[i+1] - arr[i]) == diff){
                
                List<Integer> li = new ArrayList();
                li.add(arr[i]);
                li.add(arr[i+1]);
                op.add(li);
            }
        }
        return op;
    }
}
