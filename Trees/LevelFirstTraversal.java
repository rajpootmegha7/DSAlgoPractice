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
    public List<List<Integer>> levelOrder(TreeNode root) {
     List<List<Integer>> lout = new ArrayList<>(); 
        
        Queue<TreeNode> q = new LinkedList<>();
        
        //Exit condition in case queue is empty return the empty list.
        if(root ==null) return lout;
        q.offer(root);
        //Loop until the queue is empty.
        while(!q.isEmpty()){
            int count = q.size();
            // Defining it here so that each time new list form at this level.
            ArrayList<Integer> list = new ArrayList<>();
            //Iterate until the counter is greater than 0. And add the left and right to queue. 
            while(count>0){
                TreeNode tmp = q.remove();
                if(tmp.left != null) q.offer(tmp.left);
                if(tmp.right !=null) q.offer(tmp.right);
                count --;
                list.add(tmp.val);
                
            }
            lout.add(list);
        }
        return lout;
    }
}
