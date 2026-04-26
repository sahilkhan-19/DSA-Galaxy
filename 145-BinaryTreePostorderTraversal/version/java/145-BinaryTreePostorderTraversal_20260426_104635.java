// Last updated: 4/26/2026, 10:46:35 AM
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
17    public List<Integer> postorderTraversal(TreeNode root) {
18        List<Integer> list = new ArrayList<>();
19        getPostorderTraversal(root, list);
20        return list;
21    }
22    void getPostorderTraversal (TreeNode root, List<Integer> arr){
23        if(root == null) return;
24
25        getPostorderTraversal(root.left, arr);
26        getPostorderTraversal(root.right, arr);
27        arr.add(root.val);
28    }
29}