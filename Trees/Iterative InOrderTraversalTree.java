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
    public List<Integer> inorderTraversal(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<>();
        TreeNode curr = root;
        Stack<TreeNode> s = new Stack<>();
        while(curr != null || !s.isEmpty()){
            if(curr != null){
                s.push(curr);
                curr = curr.left;
            } else {
                TreeNode temp = s.pop();
                list.add(temp.val);
                curr = temp.right;
            }
        }
        return list;
    }
   
}
