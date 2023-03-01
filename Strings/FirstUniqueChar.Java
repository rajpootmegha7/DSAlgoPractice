

/**
Given a string s, find the first non-repeating character in it and return its index. If it does not exist, return -1.

 

Example 1:

Input: s = "leetcode"
Output: 0
Example 2:

Input: s = "loveleetcode"
Output: 2
*/

class Solution {
    public int firstUniqChar(String s) {
        //First put the values in the hashmap in such a way that order of complexity is O(n+n)
        //<l, 1> and add the value if the character repeats.
        HashMap<Character, Integer> hm = new HashMap<>();
        for(int i = 0; i <s.length(); i++){
            if(!hm.containsKey(s.charAt(i))){
                hm.put(s.charAt(i), 1);
            } else {
                int val = hm.get(s.charAt(i));
                hm.put(s.charAt(i), val+1);
            }
        }
        //Loop it again to find out if the map contains that value and if it is unique.
        for(int i = 0; i<s.length(); i++){
            if((hm.get(s.charAt(i)) == 1)) return i;
        }

        return -1;
    }
}
