/**
 * Input
["KthLargest", "add", "add", "add", "add", "add"]
[[3, [4, 5, 8, 2]], [3], [5], [10], [9], [4]]
Output
[null, 4, 5, 5, 8, 8]

Explanation
KthLargest kthLargest = new KthLargest(3, [4, 5, 8, 2]);
kthLargest.add(3);   // return 4
kthLargest.add(5);   // return 5
kthLargest.add(10);  // return 5
kthLargest.add(9);   // return 8
kthLargest.add(4);   // return 8
 */
class KthLargest {
    // By default sets minimum heap.
    final PriorityQueue<Integer> heap = new PriorityQueue<>();
    final int k;

    public KthLargest(int k, int[] nums) {
        this.k = k;
        for (int n : nums) add(n);
    }

    public int add(int val) {
        if (heap.size() < k) heap.offer(val); //for adding the values of the array
        else if (val > heap.peek()) {
            heap.poll(); //remove the top element
            heap.add(val); //add the new element
        }
        return heap.peek();
    }
}