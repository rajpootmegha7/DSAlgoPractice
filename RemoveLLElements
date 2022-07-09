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
        ListNode temp = new ListNode(0);
        temp.next = head;
        ListNode prev = temp;
         while(head!=null && head.next!=null){
             if(head.val==val){
                 prev.next = head.next;
                 head = head.next;
             } else{
                 prev = head;
                 head = head.next;
             }
         }
        if(head.val ==val && head.next==null){
            prev.next=null;
        }
        return temp.next;
}
}
