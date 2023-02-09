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
        // Hashset will help us get the unique values out of the LL.
        HashSet<ListNode> ht = new HashSet<>();
        //1. First iterate through list one and add all the values in the hashset.
        while(headA!=null){
            ht.add(headA);
            headA= headA.next;
        }
        //2. First check if the values is present in the Hashset then return it and if not then move the pointer forward.
        while(headB!=null){
            if(ht.contains(headB)){
                return headB;
            } else headB = headB.next;
        }
        return null;
}
}
