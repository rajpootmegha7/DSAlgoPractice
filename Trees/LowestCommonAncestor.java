/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
//Complexity is Big O(N) number of levels we are trying to traverse through every path.
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        
        //Base Case
        if(root ==null) return null;
        
        if(root == p || root == q) return root;
        
        TreeNode left = lowestCommonAncestor(root.left,p,q);
        TreeNode right = lowestCommonAncestor(root.right,p,q);
        
        //We found p and q in left and right
        if(left !=null & right !=null) return root;
        
        if(left !=null) return left;
        else return right;
    }
}
