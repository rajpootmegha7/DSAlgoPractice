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
        TreeNode newroot = new TreeNode();
        newroot.left = invertTree(root.right);
        newroot.val = root.val;
        newroot.right = invertTree(root.left);
        return newroot;
    }
