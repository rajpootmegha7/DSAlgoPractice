/** Input: numbers = [2,7,11,15], target = 9
Output: [1,2]
Explanation: The sum of 2 and 7 is 9. Therefore, index1 = 1, index2 = 2. We return [1, 2].

Input: numbers = [2,3,4], target = 6
Output: [1,3]
Explanation: The sum of 2 and 4 is 6. Therefore index1 = 1, index2 = 3. We return [1, 3].
*/

class Solution {
    //Solution 1
    public int[] twoSum(int[] numbers, int target) {
        // First we will do the brute force analysis here
        int[] out = new int[2];
        for(int i = 0; i < numbers.length; i++){
            for(int j = 0; j < numbers.length; j++){
                if(numbers[i]+numbers[j] == target){
                    out[0] = i+1;
                    out[1] = j+1;
                }
            }
        }
        Arrays.sort(out);
        return out;
    }
    //Solution 2
    public int[] twoSum(int[] numbers, int target){
        //Optimized solution with two pointers
        int l = 0, r = numbers.length - 1;
        while(numbers[l]+ numbers[r] != target){
            if(numbers[l]+numbers[r]< target) l++;
            else r--;
        }
        return new int[]{l+1, r+1};
    }

}
