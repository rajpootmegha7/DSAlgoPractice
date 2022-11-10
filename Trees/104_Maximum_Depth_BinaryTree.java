/*
A binary tree's maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.

Input: root = [3,9,20,null,null,15,7]
Output: 3


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
    public int maxDepth(TreeNode root) {
       Queue<TreeNode> q = new LinkedList<>();
        //Variables
        int level = 0; // we will increment this after every level of the nodes.
        //Exit condition
        if(root == null) return 0;
        
        q.offer(root);
        //Main logic
        while(!q.isEmpty()){
            int qsize = q.size();
            while(qsize-- > 0){
                TreeNode tmp = q.remove();
                if(tmp.left !=null) q.offer(tmp.left);
                if(tmp.right !=null) q.offer(tmp.right);
        
            }
            //Increment the level after nodes are traversed.
           level++; 
            
        }
        return level;
    }
}
