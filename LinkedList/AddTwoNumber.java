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
    public ListNode addTwoNumbers(ListNode list1, ListNode list2) {
        //Base condition 
        if(list1!=null && list2==null) return list1;
        if(list1==null && list2==null) return list2;
        
        //Main logic
        int sum = 0;
        int carry = 0;

        ListNode list3 = new ListNode(0);
        ListNode head = list3;
        
        while(list1!=null || list2 != null){
            // To avoid null values in list when size of both list is not equal.
           sum = ((list1 != null) ? list1.val : 0) + carry + ((list2 != null) ? list2.val : 0);
           
           // This is imp when sum is more than 9
            if(sum>9){
                list3.next = new ListNode(sum % 10);
                carry = sum / 10;  
            } 
            else {
               list3.next = new ListNode(sum);
                carry = 0;
            }
            list3 = list3.next;
            // To keep moving forward until we reach the null value.
            if(list1 != null) list1 = list1.next;
            if(list2 != null) list2 = list2.next;
        }

        if(carry>0){
            list3.next = new ListNode(carry);
        }
        
        return(head.next);
        
    }
    
    
    
}
