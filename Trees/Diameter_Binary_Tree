Given the root of a binary tree, return the length of the diameter of the tree.

The diameter of a binary tree is the length of the longest path between any two nodes in a tree. This path may or may not pass through the root.

The length of a path between two nodes is represented by the number of edges between them.

            1
           /   \
          2     3
         / \
        4   5
        
Input: root = [1,2,3,4,5]
Output: 3
Explanation: 3 is the length of the path [4,2,1,3] or [5,2,1,3].


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
    // we are saving the value of maximum in this variable.
    int d =0;
    public int diameterOfBinaryTree(TreeNode root) {
         //This is returning the height of the tree from that root.
        int height = helper(root);
        return d;
        
    }
    public int helper(TreeNode root){
        if(root ==null) return 0;
        
        int lh = helper(root.left);
        int rh = helper(root.right);
        //Updating the maximum value in the diameter after compairing the old and new one.
         d = Math.max(lh+rh, d);
        // Returning the height of the tree based on whichever node is highest.
        return Math.max(lh, rh) + 1;
    }
}
