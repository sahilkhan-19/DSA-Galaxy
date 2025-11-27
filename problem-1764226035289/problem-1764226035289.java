// Last updated: 11/27/2025, 12:17:15 PM
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
17    public boolean isSymmetric(TreeNode root) {
18        if(root == null) return false;
19        
20        return check(root.left,root.right);
21    }
22    boolean check(TreeNode p, TreeNode q){
23        
24        if(p == null && q==null) return true;
25        if(p == null && q!= null || p!=null && q==null) return false;
26        if(p.val != q.val) return false;
27
28        return check(p.left,q.right) && check(p.right,q.left);
29    }
30}