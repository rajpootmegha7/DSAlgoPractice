
/**
Input: stones = [2,7,4,1,8,1]
Output: 1
Explanation: 
We combine 7 and 8 to get 1 so the array converts to [2,4,1,1,1] then,
we combine 2 and 4 to get 2 so the array converts to [2,1,1,1] then,
we combine 2 and 1 to get 1 so the array converts to [1,1,1] then,
we combine 1 and 1 to get 0 so the array converts to [1] then that's the value of the last stone.

*/


class Solution {

    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue();
        for (int stone : stones) maxHeap.add(-stone);
        while (maxHeap.size() > 1) {
            int stone1 = maxHeap.remove();
            int stone2 = maxHeap.remove();
            if (stone1 != stone2) maxHeap.add(stone1 - stone2);
        }
        return maxHeap.size() != 0 ? (-maxHeap.remove()) : 0;
    }
}

