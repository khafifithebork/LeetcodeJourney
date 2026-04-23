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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> arr = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        if(root==null) return arr;
        q.add(root);
        boolean forw = true;
        while(!q.isEmpty()){
            int n = q.size();
            List<Integer> arr1 = new ArrayList<>();
            for(int i = 0; i<n ; i++){
                TreeNode curr = q.remove();
                if(forw) arr1.addLast(curr.val);
                if(!forw) arr1.addFirst(curr.val);
                if(curr.left != null) q.add(curr.left);
                if(curr.right!= null) q.add(curr.right);
            }
            forw = !forw;
            arr.add(arr1);
        }
        return arr;
    }
}
