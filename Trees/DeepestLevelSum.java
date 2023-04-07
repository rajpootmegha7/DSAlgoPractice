
Given the root of a binary tree, return the sum of values of its deepest leaves.

Input: root = [1,2,3,4,5,null,6,7,null,null,null,null,8]
Output: 15
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
    int result=0;
    int level = 0;
    List<Integer> list = new ArrayList<>();
    public int deepestLeavesSum(TreeNode root) {
        helper(root);
        result = list.get(level-1);
        return result;
    }
    public void helper(TreeNode root){
        Queue<TreeNode> q = new LinkedList<>();
        if(root == null) return;
        q.offer(root);
        while(!q.isEmpty()){
            int sum = 0;
            int qsize = q.size();
         
            while(qsize-- >0){
                TreeNode tmp = q.remove();
                sum +=tmp.val;
                if(tmp.left!=null) q.offer(tmp.left);
                if(tmp.right!=null) q.offer(tmp.right);
            }
            list.add(sum);
            level++;
        }
    }
}
