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
    public ListNode reverseList(ListNode head) {
        
        ListNode curr = head;
        if(head == null || head.next == null) return head;
        ListNode prev = null; // 1. Create a node prev and set it to null.
        while(head != null){
           
            ListNode next = head.next; // 2. Create a temporary node next and save the head.next list there.
            head.next = prev; //3. Point the head.next to prev, to reverse it.
            prev = head; // 4. Move prev to the head.
            head = next; // 5. Move head to the next where we saved the remaining list.
        
        }
        
        return prev; // 6.IMP NOTE ---- PREV will have the pointer of reversed list.
    }
}
