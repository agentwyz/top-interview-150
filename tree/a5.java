class Solution {
    private final List<Node> pre = new ArrayList<>();

    public Node connect(Node root) {
        dfs(root, 0);    
        return root;
    }

    public void dfs(Node node, int depth) {
        if (node == null) return;

        //下面这个条件就是用来判断左边和右边的树的
        //如果先遍历左边的树, 那么就是满足下面的条件的, 若先遍历右树, 同理
        if (depth == pre.size()) {
            pre.add(node);
        } else {
            //此时是右边的树, 这个树不仅仅是以根节点为边界的, 还可以是子树分别
            //因为我们已经存储左边的节点了, 首先更新左边的节点
            pre.get(depth).next = node;
            //然后更新depth=node, 这是因为是右边的节点
            pre.set(depth, node);
        }

        dfs(node.left, depth+1);
        dfs(node.right, depth+1);
        
    }
}