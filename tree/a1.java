/*
二叉树的最大深度
*/

class Solution {
    public int maxDepth(TreeNode root) {
        if (root == null) return 0;

        return Math.max(maxDepth(root.left)+1, maxDepth(root.Right)+1);
    }
}