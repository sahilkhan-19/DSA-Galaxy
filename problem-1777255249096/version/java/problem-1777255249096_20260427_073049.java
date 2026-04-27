// Last updated: 4/27/2026, 7:30:49 AM
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
17    public int maxPathSum(TreeNode root) {
18        int[] maxSum = new int[1];
19        maxSum[0] = Integer.MIN_VALUE;
20        getSum(root,maxSum);
21        return maxSum[0];
22    }
23    int getSum(TreeNode root, int[] maxSum){
24        if(root == null) return 0;
25        int ls = Math.max(0, getSum(root.left, maxSum));
26        int rs = Math.max(0, getSum(root.right, maxSum));
27        maxSum[0] = Math.max(maxSum[0], (ls+rs+root.val));
28        return root.val + Math.max(ls,rs);
29    }
30}