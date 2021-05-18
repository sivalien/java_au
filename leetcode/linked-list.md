# Linked list

+ [Merge k Sorted Lists](merge-k-sorted-lists)

##Merge k Sorted Lists

https://leetcode.com/problems/merge-k-sorted-lists/

```java
public class ListNodeComparator implements Comparator<ListNode> {
    @Override
    public int compare(ListNode o1, ListNode o2) {
        return Integer.compare(o1.val, o2.val);
    }
}
public ListNode mergeKLists(ListNode[] lists) {
    ListNode node = new ListNode(0);
    ListNode res = node;
    PriorityQueue<ListNode> queue = new PriorityQueue<>(new ListNodeComparator());
    for (ListNode list:
         lists) {
        if (list != null)
            queue.add(list);
    }
    while (!queue.isEmpty()) {
        ListNode curr = queue.poll();
        node.next = new ListNode(curr.val);
        node = node.next;
        if (curr.next != null) {
            queue.add(curr.next);
        }
    }
    return res.next;
}
```