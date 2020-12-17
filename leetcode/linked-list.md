# Linked list

+ [Intersection of Two Linked Lists](intersection-of-two-linked-lists)

##Intersection of Two Linked Lists

https://leetcode.com/problems/intersection-of-two-linked-lists/

```java
public ListNode getIntersectionNode(ListNode head1, ListNode head2) {
    ListNode p1 = head1;
    ListNode p2 = head2;
    while ((p1 != null || p2 != null) && p1 != p2) {
        if (p1 == null)
            p1 = head2;
        else
            p1 = p1.next;
        if (p2 == null)
            p2 = head1;
        else
            p2 = p2.next;
    }
    return p1;
}
```