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
    
    public boolean answer(TreeNode node, Integer lowerLimit, Integer upperLimit) {
        int current = node.val;
        
        if (lowerLimit != null && current <= lowerLimit) {
            return false;
        }

        if (upperLimit != null && upperLimit <= current) {
            return false;
        }      

        boolean left = node.left != null ? answer(node.left, lowerLimit, current) : true;
        if (left) {
            boolean right = node.right != null ? answer(node.right, current, upperLimit) : true;
            return right;
        }
        return false;
    }
    
    public boolean isValidBST(TreeNode root) {
        if (root == null) {
            return true;
        }
        return answer(root, null, null);
    }
}