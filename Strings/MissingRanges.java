/**
Input: nums = [0,1,3,50,75], lower = 0, upper = 99
Output: ["2","4->49","51->74","76->99"]
Explanation: The ranges are:
[2,2] --> "2"
[4,49] --> "4->49"
[51,74] --> "51->74"
[76,99] --> "76->99"
*/

class Solution {
    public List<String> findMissingRanges(int[] nums, int lower, int upper) {
        /**
        Think how you will solve this using brute force first
        loop range 
         */
         ArrayList<String> res = new ArrayList<>();
           for (int curr : nums) {

			if (curr > lower) {
				res.add(toString(lower, curr - 1));
			}
			if (curr == upper) {
				return res; // Avoid overflow
			}

			// update lower
			lower = curr + 1;
		}
		
		// upper provided is bigger then last arr element
		if (lower <= upper) {
			res.add(toString(lower, upper));
		}
		return res;
    }
    public String toString(int start, int end){
        StringBuilder sb = new StringBuilder();
       
       sb.append(start);
       if(start < end){
           sb.append("->");
            sb.append(end);
       }
        
        return sb.toString();
    }
}
