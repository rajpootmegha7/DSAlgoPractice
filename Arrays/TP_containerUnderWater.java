/*
Input: height = [1,8,6,2,5,4,8,3,7]
Output: 49
Explanation: The above vertical lines are represented by array [1,8,6,2,5,4,8,3,7]. 
In this case, the max area of water (blue section) the container can contain is 49.
*/
class Solution {
    public int maxArea(int[] height) {
        
        int area = 0;
        
        int i = 0;
        int j = height.length -1;
        while(i < j){
            if((height[i] < height[j])){
                area = Math.max(area, (height[i]*(j-i)));
                i++;
            } else {
                area = Math.max(area, (height[j]*(j-i)));
                j--;
            }
         }
                                
        return area;
                                
}
}
