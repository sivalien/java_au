# Graph

+ [Maximum Depth of N-ary Tree](maximum-depth-of-n-ary-tree)

##Maximum Depth of N-ary Tree

https://leetcode.com/problems/maximum-depth-of-n-ary-tree/

```java
public int maxDepth(Node root) {
    if (root == null)
        return 0;
    if (root.children == null || root.children.isEmpty()) {
        return 1;
    }
    int maxDepthOfChild = 0;
    for (int i = 0; i < root.children.size(); i++) {
        int currDepth = maxDepth(root.children.get(i));
        if (currDepth > maxDepthOfChild) {
            maxDepthOfChild = currDepth;
        }
    }
    return maxDepthOfChild + 1;
}
```