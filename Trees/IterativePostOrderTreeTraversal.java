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
    Steps to follow:
    1. Create two stack. s1 and s2
    2. Push root in stack s1
    3.Loop while s1 is not empty , pop and push in s2. if left not null push in s1 and same with right.
    4. pop out of s2 and add in the list.
 * }
 */
class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<>();
       Stack<TreeNode> s1 = new Stack<>();
        Stack<TreeNode> s2 = new Stack<>();
        s1.push(root);
        while( !s1.isEmpty()){
            TreeNode temp = s1.pop();
            s2.push(temp);
            
            if(temp.left !=null) s1.push(temp.left);
            if(temp.right != null) s1.push(temp.right);
        }
        while(!s2.isEmpty()){
            list.add(s2.pop().val);
            
        }
        return list;
    }
}
