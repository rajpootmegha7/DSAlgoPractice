/**
Given two strings s and goal, return true if and only if s can become goal after some number of shifts on s.

A shift on s consists of moving the leftmost character of s to the rightmost position.

For example, if s = "abcde", then it will be "bcdea" after one shift.



There is very easy trick to solve this if goal string is a substring of the s+s then this means it is true.
*/

class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length() != goal.length()) return false;
        if(s.length()==0) return true;
        
        //Main logic
        String temp = new String(s);
        temp = temp+s;
        
        if(isSubstring(temp, goal))
            return true;
        
        return false;
        
    }
    public boolean isSubstring(String str1, String str2){
        // System.out.println(str1.length());
        for(int i = 0 ; i < str1.length(); i++){
            int k = 0;
            int m = i;
            // Always remember to check the length first before iterating it further.
            while(m <= str1.length() - 1 && str2.charAt(k) == str1.charAt(m)){
                // This line is checking if the length of k is matching with the total length then condition is true.
                if(k == str2.length()-1) return true;
                k++;
                m++;
            }
        }
        return false;
    }
    
    
}
