// Last updated: 5/6/2026, 12:16:52 PM
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
17    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
18        List<List<Integer>> ans = new ArrayList<>();
19        if(root == null) return ans;
20
21        Queue<TreeNode> queue = new LinkedList<>();
22        int flag = 0;
23
24        queue.add(root);
25
26        while(!queue.isEmpty()){
27            List<Integer> temp = new ArrayList<>();
28            int n = queue.size();
29
30            for(int i = 0 ; i < n ; i++){
31                TreeNode node = queue.poll();
32                temp.add(node.val);
33
34                if(node.left != null) queue.add(node.left);
35                if(node.right != null) queue.add(node.right);
36            }
37            if(flag == 1){
38                Collections.reverse(temp);
39                ans.add(temp);
40                flag = 0;
41            }else{
42                ans.add(temp);
43                flag = 1;
44            }
45        }
46        return ans;
47    }
48}