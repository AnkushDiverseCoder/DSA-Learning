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
    // public boolean isValidBST(TreeNode root) {
    //     boolean check = false;
        
    //     return checkF(root,check);
    // }
    // boolean checkF(TreeNode root,boolean check){
    //     if(root == null){
    //         return true;
    //     }
    //     if(root.left != null){
    //         if(root.left.val > root.val ){
    //             return false;
    //         }
    //     }else{
    //          return true;
    //     }
    //     if(root.right != null){
    //         if(root.right.val < root.val){
    //             return false;
    //         }
    //     }else{
    //          return true;
    //     }
    //     return isValidBST(root.left) && isValidBST(root.right);
    // }
    public boolean isValidBST(TreeNode root) {
    return fun(root, Long.MIN_VALUE, Long.MAX_VALUE);
}

private boolean fun(TreeNode node, long min, long max) {
    if (node == null) {
        return true;
    }
    if (node.val <= min || node.val >= max) {
        return false;
    }
    return fun(node.left, min, node.val) && fun(node.right, node.val, max);
}
}