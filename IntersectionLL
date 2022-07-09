/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
     
        HashSet<ListNode> ht = new HashSet<>();

        while(headA!=null){
            ht.add(headA);
            headA= headA.next;
        }
        while(headB!=null){
            if(ht.contains(headB)){
                return headB;
            } else headB = headB.next;
        }
        return null;
}
}
