/* 
Given head which is a reference node to a singly-linked list. The value of each node in the linked list is either 0 or 1.
The linked list holds the binary representation of a number.Return the decimal value of the number in the linked list.
The most significant bit is at the head of the linked list.
Ex 1 : -
Input: head = [1,0,1]
Output: 5
Explanation: (101) in base 2 = (5) in base 10

Ex 2 : -
Input: head = [0]
Output: 0

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 
 Solve it using stack push everything and reverse value will come out.
 */
class Solution {
    public int getDecimalValue(ListNode head) {
        
        //Base Condition
        if(head == null) return 0;
        if(head.next == null) return head.val * (int)Math.pow(2, 0);
       
        //Main Logic
        Stack<Integer> st = new Stack<>();
        while(head!=null){
            st.push(head.val);
            head = head.next;
        }
        int decimal = 0;
        int count = 0;
     
        while(st.size() > 0){
            int temp = st.pop();
            decimal += temp * Math.pow(2, count);
            count++;
        }
        return decimal;
    }
}
