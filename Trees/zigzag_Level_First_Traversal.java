Given the root of a binary tree, return the zigzag level order traversal of its nodes' values. (i.e., from left to right, then right to left for the next level and alternate between).

Input: root = [3,9,20,null,null,15,7]
Output: [[3],[20,9],[15,7]]

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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
       List<List<Integer>> lout = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        
        if(root ==null) return lout;
        q.offer(root);
        
        int level = 1;
        
        while(!q.isEmpty()){
            ArrayList<Integer> list = new ArrayList<>();
            int qsize = q.size();
            
            while(qsize-- > 0){
                TreeNode tmp = q.remove();
                
                if(tmp.left != null) q.offer(tmp.left);
                if(tmp.right != null) q.offer(tmp.right);
                
                if(level% 2 == 0)
                    list.add(0, tmp.val);
                else
                    list.add(tmp.val);
            }
            lout.add(list);
            level++;
        }
        return lout;
}
}
