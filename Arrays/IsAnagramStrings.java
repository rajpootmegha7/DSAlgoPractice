/**
Given two strings s and t, return true if t is an anagram of s, and false otherwise.

An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.

Example 1:

Input: s = "anagram", t = "nagaram"
Output: true

Input: s = "a", t = "ab"
Output: false

*/
class Solution {
    public boolean isAnagram(String s, String t) {
        char[] s1 = s.toCharArray();
        char[] s2 = t.toCharArray();
        
        if(s1.length !=s2.length) return false;
        
        Arrays.sort(s1);
        Arrays.sort(s2);
        for(int i = 0; i < s1.length; i++){
            if(s1[i]!= s2[i]) return false;
        }
        return true;
    }
    // Better complexity of O(n)
    public boolean isAnagram(String s, String t) {
        if(s.length != t.length) return false;
        int[] store = new store[26];

        for(int i = 0; i < s.length; i++){
            // If values are gonna be same one will add one [0,0,0,0,1,0,0,......] and another will remove it from it.
            store[s.charAt[i]-'a']++;
            store[t.charAt[i]-'a']--;
        }
        for(int val : store){
            if(val != 0) return false;
        }

        return true;
        
    }
}


