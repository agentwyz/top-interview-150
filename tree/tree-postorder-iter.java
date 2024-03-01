class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList();
        
        if (root == null) return res;
        
        Stack<TreeNode> stack = new Stack();
        TreeNode prev = null;

        while ( root != null || !stack.isEmpty() ) {
            while (root != null) {
                stack.push(root);
                root = root.left;
            }

            root = stack.pop();
            
            if (root.right == null || root.right == prev) {
                res.add(root.val);
                prev = root;
                root = null;
            } else {
                stack.push(root);
                root = root.right;
            }
        }
        return res;
    }
}