/** Given two binary strings a and b, return their sum as a binary string.

 

Example 1:

Input: a = "11", b = "1"
Output: "100"
Example 2:

Input: a = "1010", b = "1011"
Output: "10101"

*/

class Solution {
    public String addBinary(String a, String b) {
        int numA = (int) convertBinaryToInt(a);
        int numB = (int)convertBinaryToInt(b);
        int sum = numA+numB;
        return Integer.toBinaryString(sum);

    }
    public double convertBinaryToInt(String s){
        Stack<Character> stk = new Stack<>();
        //push into the stack
        for(int i = 0; i < s.length(); i++ ){
            stk.push(s.charAt(i));
        }
        // take out of stack
        int size = 0;
        double val = 0;
        while(!stk.isEmpty() && size < s.length()){
            char ch = stk.pop();
            int num = Integer.parseInt(String.valueOf(ch));
            double power = num * Math.pow(2, size);
            val = val + power;
            size++;
        }
        return val;
    }
}
