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
    public ListNode removeElements(ListNode head, int val){ 
        if(head==null){
            return null;
        }
        ListNode temp = new ListNode(0); //taking the temp list starting from 0 so that its easier to set the pointer to prev and next.
        temp.next = head; // Add the head in front of the temp
        ListNode prev = temp; // setting the prev pointer to 0
         while(head!=null && head.next!=null){
             if(head.val==val){
                 prev.next = head.next;
                 head = head.next;
             } else{
                 prev = head;
                 head = head.next;
             }
         }
        // when value is at the last of the LL
        if(head.val ==val && head.next==null){
            prev.next=null;
        }
        return temp.next;
}
}
