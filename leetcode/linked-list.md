# Linked list

+ [Reverse Linked List](reverse-linked-list)

##Reverse Linked List

https://leetcode.com/problems/reverse-linked-list/

```java
class Solution {
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null)
            return head;
        ListNode reversed = new ListNode(head.val, null);
        while (head.next != null) {
            head = head.next;
            reversed = new ListNode(head.val, reversed);
        }
        return reversed;
    }
}
```