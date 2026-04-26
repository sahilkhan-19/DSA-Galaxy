// Last updated: 4/26/2026, 11:22:15 AM
// Optimal
1/**
2 * Definition for a binary tree node.
3 * public class TreeNode {
4 *     int val;
5 *     TreeNode left;
6 *     TreeNode right;
7 *     TreeNode() {}
8 *     TreeNode(int val) { this.val = val; }
9 *     TreeNode(int val, TreeNode left, TreeNode right) {
10 *         this.val = val;
11 *         this.left = left;
12 *         this.right = right;
13 *     }
14 * }
15 */
16class Solution {
17    public boolean isBalanced(TreeNode root) {
18        return getHeight(root) != -1;
19    }
20    int getHeight(TreeNode root){
21        if (root == null) return 0;
22        int lh = getHeight(root.left);
23        if(lh == -1) return -1;
24        int rh = getHeight(root.right);
25        if(rh == -1) return -1;
26        if(Math.abs(rh-lh) > 1) return -1;
27        return Math.max(lh, rh)+1;
28    }
29}