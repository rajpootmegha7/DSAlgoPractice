/**
Given the head of a singly linked list, return true if it is a 
palindrome or false otherwise.

Input: head = [1,2,2,1]
Output: true

Input: head = [1,2]
Output: false

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
    public boolean isPalindrome(ListNode head) {
        if(head==null){
            return true;
        }
        ListNode fast = head;
        ListNode slow = head;
        while(fast!=null &&fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;
        }
        ListNode secondhalfHead = findReverse(slow);
        ListNode firsthalfHead = head;
        while(firsthalfHead!=null && secondhalfHead!=null){
            
            if(firsthalfHead.val!=secondhalfHead.val){
                return false;
            }else{
                firsthalfHead = firsthalfHead.next;
                secondhalfHead = secondhalfHead.next;
            }
           
        }
         return true;
    }
    
    public ListNode findReverse(ListNode head){
        ListNode prev= null;
        while(head!=null){
            ListNode next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        return prev;
    }
}
