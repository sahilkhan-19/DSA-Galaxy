// Last updated: 4/26/2026, 11:11:43 AM
// Brute Force
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
18        if(root == null) return true;
19
20        int lh = getHeight(root.left);
21        int rh = getHeight(root.right);
22        if(Math.abs(rh-lh) > 1) return false;
23        boolean left = isBalanced(root.left);
24        boolean right = isBalanced(root.right);
25        if(!left || !right) return false;
26        return true;
27    }
28    int getHeight(TreeNode root){
29        if (root == null) return 0;
30        int lh = getHeight(root.left);
31        int rh = getHeight(root.right);
32        return Math.max(lh, rh)+1;
33    }
34}