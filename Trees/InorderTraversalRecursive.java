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
        addTreeToList(root, list);
        return list;
    }
    public void addTreeToList(TreeNode root, ArrayList<Integer> list){
        // Exit condition
        if(root ==null) return;
        //Traversing the left part of the tree.
        addTreeToList(root.left, list);
        list.add(root.val);
        //Traversing the right part of the tree.
        addTreeToList(root.right, list);
    }
}
