// Input: head = [1,2,3,3,4,4,5]
// Output: [1,2,5]

// Given the head of a sorted linked list, delete all nodes that have duplicate numbers, 
// leaving only distinct numbers from the original list. Return the linked list sorted as well.



/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        //Base condition 
        if(head==null || head.next==null) return head;
        
        //Main logic
        ListNode dummy = new ListNode(0, head); // we created new list starting with node 0 so that its easy to take ref of prev and curr pointers.
        ListNode curr = dummy.next;
        ListNode prev = dummy;
        while(curr!= null){
            if(curr.next != null && curr.val == curr.next.val){ // If there is a duplicate node found.
                while(curr.next != null && curr.val == curr.next.val){ // move the pointer until duplicate occurs.
                    curr = curr.next;
                }
                prev.next = curr.next; // this line will remove the duplicates.
            }else {
                prev = curr; // if no duplicates are there it will move along one step at a time.
            }
            curr = curr.next;      
    }
        return dummy.next; // Returning dummy.next because node 0 is not required in the output.        
    }
}
