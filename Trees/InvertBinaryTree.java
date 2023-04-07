/* Given the root of a binary tree, invert the tree, and return its root.
Input :
    4                               
  /   \
  3     2
  
     output   :
                 4
                / \
                2  3
                
*/                
class Solution {
    public TreeNode invertTree(TreeNode root) {
        if(root == null) return null;
        // Create a new tree to save the inverted nodes in this one.
        TreeNode newroot = new TreeNode();
        // Saving the right node in left node of new tree.
        newroot.left = invertTree(root.right);
        // Adding the root value
        newroot.val = root.val;
        // Adding the left nodes in the right node of the new tree.
        newroot.right = invertTree(root.left);
        return newroot;
    }
