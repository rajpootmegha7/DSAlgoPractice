/*
Input: s = "A man, a plan, a canal: Panama"
Output: true
Explanation: "amanaplanacanalpanama" is a palindrome.
 */

class Solution {
    public boolean isPalindrome(String s) {
        
         s = s.replaceAll("[^a-zA-Z]","");
         String str = s.toLowerCase();
        
        if(str.length() == 1) return true;
        if(str == " ") return true;
        
        System.out.println(str);
        for(int i = 0, j = str.length()-1; i < j; i++, j-- ){
            if(!(str.charAt(i) == str.charAt(j))){
                return false;
            }
        }
        return true;
    }
    
}
