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
      int sum=0;
    public int rangeSumBST(TreeNode root, int low, int high) {
      
        sumofvalue(root,low,high);
        return sum; 
    }
    void sumofvalue(TreeNode node,int l,int h){
        if(node==null) return ;
        if(node.val>=l && node.val<=h) sum+=node.val;
        sumofvalue(node.left,l,h);
        sumofvalue(node.right,l,h);

    }
}