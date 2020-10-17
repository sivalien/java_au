# Linked list

+ [Middle of the Linked List](middle-of-the-linked-list)

##Middle of the Linked List

https://leetcode.com/problems/middle-of-the-linked-list/

```java
public ListNode middleNode(ListNode head) {
    ListNode right = head;
    ListNode left = head;
    while (left != null && left.next != null) {
        right = right.next;
        left = left.next.next;
    }
    return right;
}
```