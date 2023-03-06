/**

Input: nums = [-10,-3,0,5,9]
Output: [0,-3,9,-10,null,5]
Explanation: [0,-10,5,null,-3,null,9] is also accepted:

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
    /**
    We will pick the middle element to make the root node.
    Left side of the middle element pass them recursively to get left sub tree.
    Use the right side of the element to get the right subtree.
    connect these both subtree from root.

     */
    public TreeNode sortedArrayToBST(int[] nums) {
        return createBST(nums, 0, nums.length - 1);
    }
    public TreeNode createBST(int[] nums,int left,int right){
        if(left > right) return null;
        int m = (right + left) / 2;
        TreeNode root = new TreeNode(nums[m]);
        root.left = createBST(nums, left, m-1);
        root.right = createBST(nums, m+1, right);
        return root;

    }
}
