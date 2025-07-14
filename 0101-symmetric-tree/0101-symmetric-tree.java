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
    public boolean isSymmetric(TreeNode root) {
        if(root==null) return true;
        return isequl(root.left,root.right);
    }
    private boolean isequl(TreeNode node1 ,TreeNode node2){
        if(node1==null && node2==null) return true;
        if(node1==null || node2==null) return false;
        return (node1.val==node2.val) && isequl(node1.left,node2.right) && isequl(node1.right,node2.left);
    }
}