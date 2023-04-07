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
  Steps to follow:
  1. Create a new arraylist to store the sequence.
  2. Create a stack of tree.
  3. Loop while curr is not null or stack is not empty.
  4. if curr root is not at end. Keep pushing in stack. Keep moving to the left.
  5. else if end of root is reached then pop the stack and add in the list. Keep moving towards right.
  6. Return list at the end.
  
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
