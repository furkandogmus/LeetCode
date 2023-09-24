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
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if(root==null) return new TreeNode(val);
        insert(root,val);
        return root;
    }
    public void insert(TreeNode node,int val){
        if(node.val<val && node.right==null){
            node.right= new TreeNode(val);
            return;
        }
        if(node.val>val && node.left==null){
            node.left = new TreeNode(val);
            return;
        }
        if(node.val<val) insert(node.right,val);
        else insert(node.left,val);
        
    }
}