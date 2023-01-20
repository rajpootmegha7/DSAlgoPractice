class testHeap(){
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue();
        for (int stone : stones) maxHeap.add(-stone);
        system.out.println(maxheap.toString());
        while (maxHeap.size() > 1) {
            int stone1 = maxHeap.remove();2,7,4,1,8,1
            int stone2 = maxHeap.remove();
            if (stone1 != stone2) maxHeap.add(stone1 - stone2);
        }
        return maxHeap.size() != 0 ? (-maxHeap.remove()) : 0;
    }
    public static void main(String args[]){
        testHeap th = new testHeap();
        int res = th.lastStoneWeighr({2,7,4,1,8,1});
        System.out.println(res);
    }
}