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
    public TreeNode createBinaryTree(int[][] descriptions) {
        Map<Integer,TreeNode> map = new HashMap<>();
        Set<Integer> children = new HashSet<>();
        for(int i=0;i<descriptions.length;i++){
            children.add(descriptions[i][1]);
        }
        for(int[] d : descriptions){
            map.putIfAbsent(d[0],new TreeNode(d[0]));
            map.putIfAbsent(d[1], new TreeNode(d[1]));
            if(d[2]==1) map.get(d[0]).left = map.get(d[1]);
            else if(d[2]==0) map.get(d[0]).right = map.get(d[1]);
        }
        for(int val : map.keySet()){
            if(!children.contains(val)) return map.get(val);
        }
        return null;
    }
}
