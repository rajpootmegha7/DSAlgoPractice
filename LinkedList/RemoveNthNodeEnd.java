// Given the head of a linked list, remove the nth node from the end of the list and return its head.
// Ex 1 - 
// Input: head = [1,2,3,4,5], n = 2
// Output: [1,2,3,5]

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
 
 /**Logic - move fast by n steps. 
     Then move fast and slow by 1 step until fast reach end. Slow will be one step ahead of desired position.
     Adding temp here so that it works when n is length.
     When temp is taken fast will move by n+1 steps.
 */
 
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        //Base conditions
        if(head ==null) return null;
        //Main logic
        ListNode temp = new ListNode(0, head);
        
        ListNode slow = temp;
        ListNode fast = temp;
        for(int i=0; i< n+1 ; i++){
            fast = fast.next;
        }
        
        while(fast!=null){
        
            slow = slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next;
       return temp.next; 
    }
    
}
