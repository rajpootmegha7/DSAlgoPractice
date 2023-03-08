
Input: strs = ["flower","flow","flight"]
Output: "fl"



class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length == 0) return "";
        // take the first string as the prefix
        String prefix = strs[0];
        // Loop to iterate on the remaining string
        for(int i = 1; i < strs.length; i++){
            // iterate until index of prefix is found in the string.
            while(strs[i].indexOf(prefix) != 0){
                // Try to reduce the size from back of string by 1 until we find the prefix.
                prefix = prefix.substring(0, prefix.length()-1);
            }
        }
        return prefix;
        
    }
}
