/**
You are given a large integer represented as an integer array digits, where each digits[i] is the ith digit of the integer. The digits are ordered from most significant to least significant in left-to-right order. 
The large integer does not contain any leading 0's.
Increment the large integer by one and return the resulting array of digits.

Example 1:

Input: digits = [1,2,3]
Output: [1,2,4]
Explanation: The array represents the integer 123.
Incrementing by one gives 123 + 1 = 124.
Thus, the result should be [1,2,4].

*/

class Solution {
    public int[] plusOne(int[] digits) {
        int size = digits.length -1;
        int carry = 0;
        int new_digit = 0;
        
        while(size >= 0) {
            if(size == digits.length -1){
                new_digit = digits[size]+ 1;
            }else new_digit = digits[size] + carry;
            
            carry = new_digit/10;
            digits[size] = new_digit % 10;
            size --;
        }
        
        if(carry >0){
            int new_size = digits.length+1;
            int[] out = new int[new_size];
            out[0] = carry;
            for(int i =0; i < new_size  ; i++){
                if(i< digits.length) out[i+1] = digits[i];
            }
            return out; 
        }
       
        return digits;
    }
}
