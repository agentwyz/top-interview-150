二叉树的遍历方式

按照遍历的顺序一共有三种方式, 分别是前序遍历, 中序遍历, 后续遍历

前序遍历的顺序是: 中-> 左 -> 右
中序遍历的顺序是: 左-> 中 -> 右
后续遍历的顺序是: 左-> 右 -> 中

二叉树的定义:
```java
class Tree {
    private int val;
    private Tree left;
    private Tree right;
}
```

按照遍历的方式分为两种, 
1. 第一种是使用递归进行去按照顺序进行遍历
2. 第二种方式是使用栈去遍历整个数,

首先是第一种使用深度优先遍历的算法
```java
if (root == null) return;

//中间添加代码....

dfs(root.left);
dfs(root.right);
```


我们来简单介绍一下第二种方式的模版, 第二种方式就是使用stack去模拟这个完整的过程
```java
//首先创建一个栈, 保存遍历过程中的节点
stack<TreeNode> stack = new Stack<TreeNode>();

while (root != null || !stack.isEmpty()) {
    while (root != null) {
        stack.push(root);
        root = root.left;
    }

    root = stack.pop();
    root = root.right;
}
```

有了这两个模版, 我们只需要在遍历的二叉树的过程中, 进行相关的操作就可以了

下面这些题都是使用递归的模版, 
1. 104-二叉树的最大深度: 对应的题解为a1
2. 100-相同的树: 对应的题解为a2
3. 226-反转二叉树