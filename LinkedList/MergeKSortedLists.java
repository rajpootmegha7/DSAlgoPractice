Input: lists = [[1,4,5],[1,3,4],[2,6]]
Output: [1,1,2,3,4,4,5,6]
Explanation: The linked-lists are:
[
  1->4->5,
  1->3->4,
  2->6
]
merging them into one sorted list:
1->1->2->3->4->4->5->6



//  Solution using Min Heap
//  Time Complexity:         O(n*log(k))
//  Extra Space Complexity:  O(k)

class Solution1 {

    public ListNode mergeKLists(ListNode[] lists) {
        Queue<Integer> minHeap = new PriorityQueue<>(); // 1. create a queue 

        for (ListNode nodes : lists) { // for each list of list
            ListNode current = nodes;
            while (current != null) {//  curr of most inside list add it in the queue.
                minHeap.add(current.val);
                current = current.next;  
            }
        }

        ListNode dummy = new ListNode(0);   // create a new node dummy starting with 0.
        ListNode current = dummy;   // curr is set to 0.

        while (!minHeap.isEmpty()) {
            current.next = new ListNode(minHeap.poll());
            current = current.next;
        }

        return dummy.next;
    }
}
