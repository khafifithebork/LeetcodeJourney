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
    public boolean isBalanced(TreeNode root) {
        if(root == null) return true;
        return checkHeight(root);
    }
    public boolean checkHeight(TreeNode root){
        if(root == null) return true;
        int leftNode = findHeight(root.left);
        int rightNode = findHeight(root.right);
        if(Math.abs(leftNode - rightNode) > 1) return false;
        return checkHeight(root.left) && checkHeight(root.right);
    }
    public int findHeight(TreeNode node){
        if(node == null) return 0;
        int leftNode = findHeight(node.left);
        int rightNode = findHeight(node.right);
        return 1+Math.max(leftNode, rightNode);
    }
}
