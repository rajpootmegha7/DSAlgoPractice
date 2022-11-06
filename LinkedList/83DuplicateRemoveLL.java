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
        ListNode dummy = new ListNode(0, head);
        ListNode curr = dummy.next;
        ListNode prev = dummy;
        while(curr!= null){
            if(curr.next != null && curr.val == curr.next.val){
                while(curr.next != null && curr.val == curr.next.val){
                    curr = curr.next;
                }
                prev.next = curr.next;
            }else {
                prev = curr;
            }
            curr = curr.next;      
    }
        return dummy.next;         
    }
}
