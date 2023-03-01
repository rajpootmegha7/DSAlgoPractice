/**
Given a non-negative integer x, return the square root of x rounded down to the nearest integer. The returned integer should be non-negative as well.

Input: x = 8
Output: 2
Explanation: The square root of 8 is 2.82842..., and since we round it down to the nearest integer, 2 is returned.

*/

class Solution {
       public int mySqrt(int x) {
       long start = 0;
       long end = x;
       // Using binary search and hence the complexity is O(logn)
       //Main logic for all the other values.
       while(start +1 < end){
           long mid = start +(end - start)/2;
           if(mid*mid == x) return (int) mid;
            else if(mid*mid < x){
               start = mid;
           } else end = mid;
           
       }
       if(end * end ==x) return (int) end; // if the end value matches then return it.
       else return (int) start; // if the start values matches then return it.
    }
}
