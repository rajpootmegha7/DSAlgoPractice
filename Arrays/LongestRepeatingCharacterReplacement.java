/**
You are given a string s and an integer k. You can choose any character of the string and change it to any other uppercase English character. 
You can perform this operation at most k times.

Return the length of the longest substring containing the same letter you can get after performing the above operations.


Input: s = "ABAB", k = 2
Output: 4
Explanation: Replace the two 'A's with two 'B's or vice versa.
*/

public int characterReplacement(String s, int k) {

        // Taken the map to store the char and occurance of that char.
        HashMap<Character, Integer> map = new HashMap<>(); 
        int left = 0, right = 0; // for sliding window pointers [left ....right]
        int max_len = 0;      // max length of the window
        int most_freq = 0;  // most freq char in the window

        while (right < s.length()) {
            //increase sliding window
            if (map.containsKey(s.charAt(right))) {
                map.put(s.charAt(right), map.get(s.charAt(right)) + 1);
            } else {
                map.put(s.charAt(right), 0);
            }
            most_freq = Math.max(most_freq, map.get(s.charAt(right))); // update the most freq.

            if ((right - left + 1) - most_freq > k) { // shrink the window
                map.put(s.charAt(right), map.get(s.charAt(right)) - 1);
                left++;
            }
            max_len = Math.max(right - left + 1, max_len); // update the max length
            right++;
        }
        return max_len;
    }
