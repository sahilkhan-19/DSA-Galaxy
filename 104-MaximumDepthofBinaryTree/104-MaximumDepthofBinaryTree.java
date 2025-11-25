// Last updated: 11/25/2025, 12:15:03 PM
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
    public int maxDepth(TreeNode root) {
        return getHeight(root);
    }
    int getHeight(TreeNode root){
        if (root == null) return 0;
        int lh = getHeight(root.left);
        int rh = getHeight(root.right);
        return Math.max(lh, rh)+1;
    }
}