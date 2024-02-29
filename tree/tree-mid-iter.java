class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        //首先将左边一条边, 全部加入进去
        Stack<TreeNode> stack = new Stack();
        List<Integer> res = new ArrayList();

        
        while (root != null || !stack.isEmpty()) {
            //左边的一条边全部加入
            while (root != null) {
                stack.push(root);
                root = root.left;
            }

            //不断弹出左边的最底下的
            root = stack.pop();
            res.add(root.val);
            root = root.right;
        }

        return res;
    }
}