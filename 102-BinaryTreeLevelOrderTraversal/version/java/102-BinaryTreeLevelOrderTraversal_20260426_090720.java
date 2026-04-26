// Last updated: 4/26/2026, 9:07:20 AM
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
17    public List<List<Integer>> levelOrder(TreeNode root) {
18        Queue<TreeNode> queue = new LinkedList<>();
19        List<List<Integer>> list = new LinkedList<>();
20
21        if(root == null) return list;
22        queue.offer(root);
23
24        while(!queue.isEmpty()){
25            int levelNum = queue.size();
26            List<Integer> subList = new LinkedList<>();
27            for(int i = 0 ; i < levelNum ; i++){
28                if(queue.peek().left != null) queue.offer(queue.peek().left);
29                if(queue.peek().right != null) queue.offer(queue.peek().right);
30
31                subList.add(queue.poll().val);
32            }
33            list.add(subList);
34        }
35        return list;
36    }
37}