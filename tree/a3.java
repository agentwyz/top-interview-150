class Solution {
    public TreeNode invertTree(TreeNode root) {
        if (root == null) return null;
    
        TreeNode node = root.right;
        root.right = root.left;
        root.left = node;

        //注意这里已经交换过来了, 原来的right, 已经变成了left
        //现在只需要将原来的right的子节点转换一下就可以了
        invertTree(root.left);
        invertTree(root.right);
        return root;
    }
}

class Solution {
    public TreeNode invertTree(TreeNode n) {
       Stack<TreeNode> stack = new Stack<>();
        TreeNode root = n;
        while (root != null || !stack.isEmpty()) {
            while (root != null) {
                stack.push(root);

                TreeNode temp = root.left;
                root.left = root.right;
                root.right = temp;
                
                root = root.left;
            }
            
            //如果stack不为null
            root = stack.pop();
            root = root.right;
            
        }
        return n;
    }
}