# Design

+ [Binary Search Tree Iterator](binary-search-tree-iterator)

##Binary Search Tree Iterator

https://leetcode.com/problems/binary-search-tree-iterator/

```java
LinkedList<Integer> bst = new LinkedList<Integer>();
public BSTIterator(TreeNode root) {
    this.inOrder(root);
}
private void inOrder(TreeNode root) {
    if (root != null) {
        this.inOrder(root.left);
        this.bst.addLast(root.val);
        this.inOrder(root.right);
    }
}
/** @return the next smallest number */
public int next() {
    return bst.removeFirst();
}
/** @return whether we have a next smallest number */
public boolean hasNext() {
    return bst.size() > 0;
}
```