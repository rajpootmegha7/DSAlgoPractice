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
    public List<Integer> preorderTraversal(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<>();
        helper(root, list);
        return list;
    }
    /*
    * 1. Visit the Root.
    * 2. Traverse the left subtree In PreOrder.
    * 3. Traverse the right subtree in PreOrder.
    */
    public void helper(TreeNode root, ArrayList<Integer> list){
        //Exit condition
        if(root ==null) return;
        list.add(root.val);
        helper(root.left, list);
        helper(root.right, list);
    }
}
