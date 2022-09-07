
Given the root of a binary tree, return the lowest common ancestor of its deepest leaves.

Recall that:

The node of a binary tree is a leaf if and only if it has no children
The depth of the root of the tree is 0. if the depth of a node is d, the depth of each of its children is d + 1.
The lowest common ancestor of a set S of nodes, is the node A with the largest depth such that every node in S is in the subtree with root A.

Ex1: 
Input: root = [3,5,1,6,2,0,8,null,null,7,4]
Output: [2,7,4]
Explanation: We return the node with value 2, colored in yellow in the diagram.
The nodes coloured in blue are the deepest leaf-nodes of the tree.
Note that nodes 6, 0, and 8 are also leaf nodes, but the depth of them is 2, but the depth of nodes 7 and 4 is 3
Ex2:
Input: root = [0,1,3,null,2]
Output: [2]


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
    private int maxDepth;
    private TreeNode lca;
    public TreeNode lcaDeepestLeaves(TreeNode root) {
        maxDepth =0;
        dfs(root,0);
        return lca;
    }
    public int dfs(TreeNode root, int currD){
        maxDepth = Math.max(maxDepth, currD);
        
        if(root ==null) return currD;
        
        int left = dfs(root.left, currD+1);
        int right = dfs(root.right, currD+1);
        //Very imp to understand what we did here.
        if(left ==maxDepth && right == maxDepth ){
            lca = root;
        }
        return Math.max(left, right);
        
    }
}
