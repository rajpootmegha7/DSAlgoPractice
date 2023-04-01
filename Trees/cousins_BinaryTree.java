Given the root of a binary tree with unique values and the values of two different nodes of the tree x and y, return true if the nodes corresponding to the values x and y in the tree are cousins, or false otherwise.

Two nodes of a binary tree are cousins if they have the same depth with different parents.

Note that in a binary tree, the root node is at the depth 0, and children of each depth k node are at the depth k + 1.

Input: root = [1,2,3,4], x = 4, y = 3
Output: false


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
    public boolean isCousins(TreeNode root, int x, int y) {
        Queue<TreeNode> q = new LinkedList<>();
        int levelx = 1;
        int levely = 1;
        int level = 1;
        
        if(root==null) return false;
        q.add(root);
        
        //Main logic
        while( !q.isEmpty()){
            int qsize  = q.size();
            
            while(qsize-- >0 ){
                
                TreeNode tmp = q.remove();
                
                //Condition to check the level in first attempt.
                if(tmp.val == x) levelx = level;
                if(tmp.val == y) levely = level;
                
                if(tmp.left != null) q.add(tmp.left);
                if(tmp.right != null) q.add(tmp.right);
                
                // condition for the parent check
                if(tmp.left != null && tmp.right != null){
                    if((tmp.left.val == x && tmp.right.val == y) || (tmp.left.val == y && tmp.right.val == x)){
                        return false;
                    }
                }
                
            }
            level++;
        }
        if(levelx == levely) return true;
        else return false;
    }
}
