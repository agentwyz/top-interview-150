class Solution {
    public boolean isSymmetric(TreeNode root) {
        if (root == null) return true;

        return dfs(root.left, root.right);
    }

    public boolean dfs(TreeNode l, TreeNode r) {
        if (l == null && r == null) return true;
        if (l == null || r == null) return false;
        if (l.val != r.val) return false;

        return dfs(l.left, r.right) && dfs(l.right, l.right);
    }
}