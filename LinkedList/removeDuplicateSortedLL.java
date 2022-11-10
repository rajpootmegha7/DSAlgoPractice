Given the head of a sorted linked list, delete all duplicates such that each element appears only once. Return the linked list sorted as well.

Input: head = [1,1,2]
Output: [1,2]

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 sol : 
 
 Take curr and next. If curr.val and next.val is same keep moving next until condition is false.
 Once same and next is not null, point curr.next to new next position. 
 It will remove all the duplicates.
 
 
 */
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode curr = head;        
        while(curr!=null && curr.next!=null){
            ListNode nextNode = curr.next;

                if(curr.val == nextNode.val){
                    while( nextNode!=null && curr.val ==nextNode.val){
                    nextNode = nextNode.next;
                }
                curr.next = nextNode;
            }
         curr = curr.next;    
            
      }        
    return head;
    }
}
