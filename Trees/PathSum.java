112 - Given the root of a binary tree and an integer targetSum, return true if the tree has a root-to-leaf path such that adding up all the values along the path equals targetSum.

A leaf is a node with no children.
Ex: 1
Input: root = [5,4,8,11,null,13,4,7,2,null,null,null,1], targetSum = 22
Output: true
Explanation: The root-to-leaf path with the target sum is shown.

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
/*
Basic technique :
 if x+y+z = 11 then z = 11-y-x;
 Using this equation we are calculating the sum of path and compairing it with the targetSum.
*/
class Solution {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root ==null) return false;
        if(root.left == null && root.right ==null && root.val ==targetSum) return true;
        
        return( hasPathSum(root.left, targetSum-root.val) ||(hasPathSum(root.right, targetSum-root.val)));
    }
}
