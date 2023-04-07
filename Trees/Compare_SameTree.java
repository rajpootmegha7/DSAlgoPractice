Description: Given the roots of two binary trees p and q, write a function to check if they are the same or not.
Two binary trees are considered the same if they are structurally identical, and the nodes have the same value.

Input1: p = [1,2,3], q = [1,2,3]
Output: true

Input2: p = [1,2], q = [1,null,2]
Output: false

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        //Comparing both the nodes at the same time and using recurssion to traverse until the last node.
        return (helper(p,q));
        
    }
    public boolean helper(TreeNode p, TreeNode q){
        if(p == null && q == null) return true;
        if((p == null && q != null) || (p != null && q ==null)) return false;
        if(p.val != q.val) return false;
        
        //When we add two condition in an AND operator it only returns true if both are true; 
        return helper(p.left, q.left) && helper(p.right, q.right);
        }
        
       
    
}
