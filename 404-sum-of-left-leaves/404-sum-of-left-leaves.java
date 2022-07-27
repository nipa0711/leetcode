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
    public int sumOfLeftLeaves(TreeNode root) {
        return checkRightNode(root);
    }

    private int checkRightNode(TreeNode node) {
        if (node == null) {
            return 0;
        }            

        return checkLeftNode(node.left) + checkRightNode(node.right);
    }

    private int checkLeftNode(TreeNode node) {
        if (node == null) {
            return 0;
        }           

        if (node.left == null && node.right == null) {
            return node.val;
        }            

        return checkLeftNode(node.left) + checkRightNode(node.right);
    }
}