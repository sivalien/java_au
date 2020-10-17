# Linked list

+ [Merge Two Sorted Lists](merge-two-sorted-lists)

##Merge Two Sorted Lists

https://leetcode.com/problems/merge-two-sorted-lists/

```java
public ListNode mergeTwoLists(ListNode head1, ListNode head2) {
    if (head1 == null)
        return head2;
    if (head2 == null)
        return head1;
    if (head1.val <= head2.val)
        return new ListNode(head1.val, mergeTwoLists(head1.next, head2));
    else
        return new ListNode(head2.val, mergeTwoLists(head1, head2.next));
}
```