// Last updated: 4/26/2026, 12:00:19 PM
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
17    public int diameterOfBinaryTree(TreeNode root) {
18        int[] arr = new int[1];
19        getHeight(root,arr);
20        return arr[0];
21    }
22    int getHeight(TreeNode root, int[] arr){
23        if (root == null) return 0;
24        int lh = getHeight(root.left, arr);
25        int rh = getHeight(root.right, arr);
26        arr[0] = Math.max((lh+rh), arr[0]);
27        return 1 + Math.max(lh, rh);
28    }
29}