/*
Given a binary tree, find its minimum depth.

The minimum depth is the number of nodes along the shortest path from the root node down to the nearest leaf node.

Note: A leaf is a node with no children.

Input: root = [3,9,20,null,null,15,7]
Output: 2

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
    public int minDepth(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        
        // Exit condition
        if(root ==null) return 0;
        
        q.offer(root);
        
        //variable declaration
        int min_level = 0, level = 0;
        long min = Integer.MAX_VALUE;
        
        //main logic
        while(!q.isEmpty()){
            //diff with LST is we don't need counter here we will play with sum here.
            int qsize = q.size();
            
            //Loop around sum.
            while(qsize-- > 0){
                TreeNode tmp = q.remove();
                if(tmp.left == null && tmp.right == null){
                    return level + 1;
                }
                if(tmp.left != null) q.offer(tmp.left);
                if(tmp.right !=null) q.offer(tmp.right);
            }

            level++;  
        }
        return level + 1;
    }
}
