/**
Given an array of strings strs, group the anagrams together. You can return the answer in any order.

Input: strs = ["eat","tea","tan","ate","nat","bat"]
Output: [["bat"],["nat","tan"],["ate","eat","tea"]]

*/

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ans = new ArrayList<>();
        HashMap<String, List<String>> hm = new HashMap<>();
        
        for(String s : strs) {
            char[] arr = s.toCharArray();
            Arrays.sort(arr);
            
            // Converting sorted char array back to String
            String temp = new String(arr);
            
            if(hm.containsKey(temp)) {
                // if key contains in the hashmap already
                // push it at the end of list
                hm.get(temp).add(s); 
            } else {
                List<String> list = new ArrayList<>();
                list.add(s);
                hm.put(temp, list);
            }
        }
        
        for(String s : hm.keySet()) {
            ans.add(hm.get(s));
        }
        return ans;
        
    }
}
