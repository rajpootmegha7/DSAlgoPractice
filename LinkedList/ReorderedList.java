
Input: head = [1,2,3,4]
Output: [1,4,2,3]


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
    public int lenList(ListNode head){
        int count = 1;
        while(head != null){
            count++;
            head = head.next;
        }
        return count;
    }
    public void reorderList(ListNode head) {
        
        if(head ==null || head.next ==null || head.next.next == null) return;
        
        // Using stack of nodes 
        Stack<Integer> stk = new Stack<>();
        ListNode curr = head;
        // New approach is feed the list into the stack.
        while(curr != null){
            stk.push(curr.val);
            curr = curr.next;
        }
        int len = stk.size();
        
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null){
          slow = slow.next; // slow will be on the midpoint
          fast = fast.next.next;
        } 
        System.out.println("slow.val"+ slow.val);
        
        ListNode newCurr = head;
        ListNode prev = null;
        while(newCurr.val != slow.val){
        System.out.println("newCurr.val"+ newCurr.val);
        ListNode tmp = newCurr.next;
        newCurr.next = new ListNode(stk.pop());
        newCurr.next.next = tmp;
        prev = newCurr.next;
        newCurr = newCurr.next.next; 
        }
        
        if(len % 2 == 0){
            
            prev.next = null; 
        }
        else
            prev.next.next = null;
        
    }
}
