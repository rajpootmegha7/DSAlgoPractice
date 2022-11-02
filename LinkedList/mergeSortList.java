You are given the heads of two sorted linked lists list1 and list2.

/*
Merge the two lists in a one sorted list. The list should be made by splicing together the nodes of the first two lists.

Return the head of the merged linked list.
Example 1:
Input: list1 = [1,2,4], list2 = [1,3,4]
Output: [1,1,2,3,4,4]

Example 2:
Input: list1 = [], list2 = []
Output: []

*/

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
// Optimized and clean solution1 
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        
        if(list1 ==null && list2 ==null) return null;
        else if(list1 ==null && list2 !=null) return list2;
        else if(list2 ==null && list1 !=null) return list1;
        
        final ListNode root = new ListNode();
        
        ListNode prev = root;
        
        while(list1 != null && list2 !=null) {
            if(list1.val < list2.val){
                prev.next = list1;
                list1 = list1.next;
            } else {
                prev.next = list2;
                list2 = list2.next;
            }
            prev = prev.next;
        }
        prev.next = list1 !=null ? list1 : list2;// awesome one line of code for condition where list                                                       size is not the same and one list is not empty.
        return root.next;
    }
    
    
    // Solution 2 : broad and descriptive.
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        
        //Base Conditions
        if(list1 == null && list2 == null) return null;
        else if(list1 == null && list2 !=null) return list2;
        else if(list1 != null && list2 ==null) return list1;
        
        ListNode flist = new ListNode(0);
        ListNode list3 = flist;
        
        while(list1!=null && list2!=null){
         
            if(list1.val < list2.val){
                list3.next = new ListNode(list1.val);
                list1 = list1.next;
                list3 = list3.next;
             }
            else if (list2.val < list1.val){
                list3.next = new ListNode(list2.val);
                list2 = list2.next;
                list3 = list3.next;
            }else if (list1.val == list2.val){
                list3.next = new ListNode(list2.val);
                list3 = list3.next;
                list3.next = new ListNode(list2.val);
                list3 = list3.next;
                list1 = list1.next;
                list2 = list2.next;
            }
        }
        // TO check in case on list is not empty yet.
        if(list1 != null){
            // System.out.println("Inside");
            while(list1 != null){
               list3.next = new ListNode(list1.val);
                list1 = list1.next;
                list3 = list3.next;
            }
        }
        if(list2 != null){
            while(list2 != null){
               list3.next = new ListNode(list2.val);
                list2 = list2.next;
                list3 = list3.next;
            }
        }
         return flist.next;
    }
    private ListNode insertNodeAtEnd(int data, ListNode head){
        ListNode temp = new ListNode(data);
        ListNode curr = head;
        while(curr.next!=null){
            curr = curr.next;
        }
        curr.next = temp;
        temp.next = null;
        return head;
    }
    private void pList(ListNode head){
       int length = 0;
        while(head!=null){
            System.out.println(head.val);
            head = head.next;
        }
        return;
    }
}
