/**
Question - Given a string s, find the length of the longest substring without repeating characters.

Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3.
------------------------Interview practice ---------------------
1. Repeat the question and clear the understanding.
2. Assumptions that I can make:
    All characters are lower case.

3. Base conditions:
    - String length 0 return 0
    - String length 1 return 1
4. Main logic: 
    1. Convert the string into char array.
    2. Iterative over all the char array. 
    3. Inside the iteration I will iterate over the substring value until its repeating again.
    4. Hashset to store the non repeating substring.
    5. clear the hashset once substring condition end.
    6. Store the size of hashset in a maxLength variable. Replace it each time if size is greater.
    7. Return the maxLength.
    
*/
class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        if(s.length() == 0) return 0;
        if(s.length() == 1) return 1;
        
        int maxLength = Integer.MIN_VALUE;
        
        char[] str = s.toCharArray();
        HashSet<Character> hs = new HashSet<>();
        
        for(int i = 0; i < str.length; i++){
           
            int p = i; // Because I will iterate it.
            while(p < str.length && !hs.contains(str[p])){
                hs.add(str[p]);
                p++;
            }
            if(hs.size() > 0){
                maxLength = Math.max(hs.size(), maxLength);
                hs.clear();
            }
            
            
        }
        return maxLength;
    }
}
