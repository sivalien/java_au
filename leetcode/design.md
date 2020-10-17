# Design

+ [Flatten Nested List Iterator](flatten-nested-list-iterator)

##Flatten Nested List Iterator

https://leetcode.com/problems/flatten-nested-list-iterator/

```java
private ArrayDeque <Integer> integers =new ArrayDeque<Integer>();
public NestedIterator(List<NestedInteger> nestedList) {
    for (int i = 0; i < nestedList.size(); i++) {
        if (nestedList.get(i).isInteger())
            integers.addLast(nestedList.get(i).getInteger());
        else
            nestedList.addAll(i + 1, nestedList.get(i).getList());
    }
}
@Override
public Integer next() {
    return integers.pollFirst();
}
@Override
public boolean hasNext() {
    return integers.size() > 0;
}
```