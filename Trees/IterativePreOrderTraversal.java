//Input: root = [1,null,2,3]
//Output: [1,2,3]
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
Create an empty stack
Push the root into Stack
Loop until Stack is empty
Pop the last node and print its value
Push right and left node if they are not null
Repeat from steps 4 to 6 again.


Read more: https://www.java67.com/2016/07/binary-tree-preorder-traversal-in-java-without-recursion.html#ixzz7xc1lhGS3
 */

class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<>();
        if(root == null) return list;
        Stack<TreeNode> s = new Stack<>();
        s.push(root);
        while(!s.isEmpty()){
            TreeNode temp = s.pop();
            list.add(temp.val);
            if(temp.left != null) s.push(temp.left);
            if(temp.right != null) s.push(temp.right);
        }
        return list;
    }
}
