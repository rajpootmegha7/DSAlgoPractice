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
    public int maxLevelSum(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        
        // Exit condition
        if(root ==null) return 0;
        
        q.offer(root);
        
        //variable declaration
        int max_level = 1, level = 1;
        long max = Integer.MIN_VALUE;
        
        //main logic
        while(!q.isEmpty()){
            //diff with LST is we don't need counter here we will play with sum here.
            int qsize = q.size();
            int sum = 0;
            
            //Loop around sum.
            while(qsize-- > 0){
                TreeNode tmp = q.remove();
                sum += tmp.val;
                
                if(tmp.left != null) q.offer(tmp.left);
                if(tmp.right !=null) q.offer(tmp.right);
            }
            
            if(sum > max){
                max = sum;
                max_level = level;
            }
            level++;  
        }
        return max_level;
    }
}
