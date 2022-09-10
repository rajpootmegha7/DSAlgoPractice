Given the root of a binary tree and an integer targetSum, return all root-to-leaf paths where the sum of the node values in the path equals targetSum. Each path should be returned as a list of the node values, not node references.

A root-to-leaf path is a path starting from the root and ending at any leaf node. A leaf is a node with no children.

Input: root = [5,4,8,11,null,13,4,7,2,null,null,5,1], targetSum = 22
Output: [[5,4,11,2],[5,8,4,5]]
Explanation: There are two paths whose sum equals targetSum:
5 + 4 + 11 + 2 = 22
5 + 8 + 4 + 5 = 22
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
    List<List<Integer>> rlist = new ArrayList<>();
    List<Integer> path = new ArrayList<>();
    
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
       List<Integer> path = new ArrayList<>(); 
        
        dsfPathSum(root, targetSum, 0, path);
       return rlist;
    }
   
    public void dsfPathSum(TreeNode root , int t , int sum ,List<Integer> path) {
		if (root==null) {
			return;
		}
		//Adding the root value to our path list
		path.add(root.val);
		// Storing the sum of the current path
		sum+=root.val;
		
		// TO check if it is a leaf node or not
		if (root.left==null&&root.right==null) {

            
			if (sum==t) {
				rlist.add(new ArrayList<>(path));
			} 
        path.remove((path.size()-1));

			
			return;
		} 


		
		
			dsfPathSum(root.left, t, sum, path);

			dsfPathSum(root.right, t, sum, path);
                                path.remove((path.size()-1));

	}
}
